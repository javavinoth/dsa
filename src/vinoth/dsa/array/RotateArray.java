package vinoth.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RotateArray {

    public static int[] leftRotate(int[] arr, int k) {
        int length = arr.length - 1;
        for (int i = 0; i < k; i++) {
            int left = arr[0];
            for (int j = 0; j < length; j++) {
                arr[j] = arr[j + 1];
            }
            arr[length] = left;
        }
        return arr;
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // Handle cases where k >= n
        if (k == 0) return;

        // Step 1: Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Step 2: Reverse the remaining n-k elements
        reverse(arr, k, n - 1);

        // Step 3: Reverse the entire array
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rightRotate(int[] arr, int k) {
        int length = arr.length - 1;
        for (int i = 0; i < k; i++) {
            int right = arr[length];
            for (int j = length; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = right;
        }
        return arr;
    }


    public static Object[] rotate(Object[] arr, int k) {
        List<Object> list;
        for (int i = 0; i < k; i++) {
            list = new ArrayList<>();
            list.add(arr[arr.length - 1]);
            List<Object> subList = Arrays.stream(arr).toList().subList(0, arr.length - 1);
            list.addAll(subList);
            arr = list.toArray();
        }
        return arr;
    }

    public static void main(String[] args) {
//        Object[] i = new Integer[]{1, 2, 3, 4, 5, 6, 7};
//        Object[] rotate = rotate(i, 3);
//        Arrays.stream(rotate).forEach(System.out::print);
//        System.out.println("******");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
        int[] arr1 = {8, 9};
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        Set<Integer> collect1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        collect.addAll(collect1);
        collect.stream().toList();
        Arrays.stream(leftRotate(arr, 3)).forEach(System.out::print);
//        rotateLeft(arr, 3);
//        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("******");
//        Arrays.stream(rightRotate(arr, 3)).forEach(System.out::print);
    }
}
