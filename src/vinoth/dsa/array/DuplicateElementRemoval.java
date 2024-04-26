package vinoth.dsa.array;

import java.util.Arrays;

public class DuplicateElementRemoval {

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

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 7, 8};
//        int[] arr = {1, 1, 4, 7, 7, 8};
//        System.out.println(Arrays.toString(duplicateRemoval(arr)));
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("***");
        Arrays.stream(duplicateRemoval(arr)).forEach(System.out::print);
    }


}
