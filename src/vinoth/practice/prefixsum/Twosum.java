package vinoth.practice.prefixsum;

import java.util.Arrays;
//targetsum
public class Twosum {

    public static int[] twoSum(int[] arr, int k) {
        int[] result = new int[2];
        int[] prefixSum = prefixSum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (prefixSum[i] == k) {
                result[0] = i - 1;
                result[1] = i;
            }
        }
        return result;
    }

    private static int[] prefixSum(int[] arr) {
        int[] pf = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sum = arr[i];
                pf[i] = sum;
            } else {
                sum = sum + arr[i];
                pf[i] = sum;
            }
        }
        return pf;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] prefixSum = prefixSum(arr);
//        Arrays.stream(prefixSum).forEach(System.out::println);
        int[] twoSum = twoSum(arr, 9);
        Arrays.stream(twoSum).forEach(System.out::println);

    }
}
