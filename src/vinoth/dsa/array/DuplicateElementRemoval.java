package vinoth.dsa.array;

import java.util.Arrays;

public class DuplicateElementRemoval {

    public static int[] dR(int[] arr) {
        int i = 0;
        int j = 1;
        while (j < arr.length) {
            if (arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
            j++;
        }
        int[] unique = new int[++i];
        System.arraycopy(arr, 0, unique, 0, i);
        return unique;
    }

    public static int[] duplicateRemoval(int[] arr) {
        int start = 0;
        for (int end = 1; end < arr.length; end++) {
            if (arr[start] != arr[end]) {
                start++;
                arr[start] = arr[end];
            }
        }
        int[] unique = new int[start];
        System.arraycopy(arr, 0, unique, 0, start);
        return unique;
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;


        // To store index of next unique element
        int j = 0;

        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 0; i < n - 1; i++) {
            int i1 = arr[i];
            int i2 = arr[i + 1];
            if (i1 != i2) {
                int i3 = arr[j++];
                int i31 = arr[i];
                i3 = i31;
            }
        }

        int i = arr[j++];
        int i1 = arr[n - 1];
        i = i1;
        int[] unique = new int[j];
        System.arraycopy(arr, 0, unique, 0, j);
        return unique;
    }

    public static int[] moveZeros(int[] arr) {
        int start = 0;
        for (int end = 1; end < arr.length; end++) {
            if (arr[start] == 0) {
                arr[start] = arr[end];
                start++;
                arr[start] = 0;
            } else {
                start++;
            }
        }
//        int[] unique = new int[start];
//        System.arraycopy(arr, 0, unique, 0, start);
        return arr;
    }

    public static void main(String[] args) {
//        int[] arr = {0,1,0,3,12};
        int[] arr = {1, 2, 2, 3, 4};
        int[] arr1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        System.out.println(Arrays.toString(duplicateRemoval(arr)));
//        Arrays.stream(arr).forEach(System.out::print);
//        System.out.println("***");
//        Arrays.stream(duplicateRemoval(arr)).forEach(System.out::print);
        System.out.println("***");
        Arrays.stream(dR(arr1)).forEach(System.out::print);

    }


}
