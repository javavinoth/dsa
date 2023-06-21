package vinoth.dsa.prefixsum;

public class PrefixSum {

    public static long[] prefixSum(int[] arr) {
        int arrLength = arr.length;
        long[] prefixSum = new long[arrLength];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arrLength; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (long l : prefixSum) {
            System.out.print(l+" ");
        }
        System.out.println();
        return prefixSum;
    }
}
