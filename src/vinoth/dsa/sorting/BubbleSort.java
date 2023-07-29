package vinoth.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    //https://www.programiz.com/dsa/bubble-sort
    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{2, 4, 5, 3, 1})));
    }
}
