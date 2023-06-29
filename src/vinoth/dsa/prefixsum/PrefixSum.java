package vinoth.dsa.prefixsum;

public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        prefixSum(arr);
        solve(arr);
    }

    public static long[] prefixSum(int[] arr) {
        int arrLength = arr.length;
        long[] prefixSum = new long[arrLength];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arrLength; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (long l : prefixSum) {
            System.out.print(l + " ");
        }
        System.out.println();
        return prefixSum;
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            A[i] = A[i - 1] + A[i];
        }
        for (int l : A) {
            System.out.print(l + " ");
        }
        return A;
    }
}
