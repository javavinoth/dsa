package vinoth.dsa.prefixsum;

import java.util.Arrays;

/**
 * Given array elements[] and queries[][], for every query calculate sum of all index elements
 */
public class RangeQueries {

    public static void main(String[] args) {
        int[] arr = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        int[][] query = {{6, 9}, {2, 9}, {2, 4}, {0, 9}};
        long[] rangeSumBruteforce = rangeSumBruteforce(arr, query);
        long[] rangeSumOptimised = rangeSumOptimised(arr, query);
        Arrays.stream(rangeSumBruteforce).boxed().forEach(System.out::println);
        System.out.println("******");
        Arrays.stream(rangeSumOptimised).boxed().forEach(System.out::println);
    }

    private static long[] rangeSumBruteforce(int[] arr, int[][] query) {
        int queryLength = query.length;
        long[] sums = new long[queryLength];
        for (int i = 0; i < queryLength; i++) {
            int start = query[i][0];
            int end = query[i][1];
            long sum = 0;
            for (int j = start; j <= end; j++) {
                sum = sum + arr[j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    private static long[] rangeSumOptimised(int[] arr, int[][] query) {
        int queryLength = query.length;
        long[] prefixSum = PrefixSum.prefixSum(arr);
        long[] sums = new long[queryLength];
        for (int i = 0; i < queryLength; i++) {
            int start = query[i][0];
            int end = query[i][1];
            if (start == 0) {
                sums[i] = prefixSum[end];
            } else {
                sums[i] = prefixSum[end] - prefixSum[start - 1];
            }
        }
        return sums;
    }
}
