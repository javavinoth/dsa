package vinoth.dsa.prefixsum;

/**
 * An index is said to equilibrium if sum of all elements on left of ith index = sum of all elements on right of ith index
 */
public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 1, 2, 3};
        System.out.println(count(arr));
    }

    private static int count(int[] arr) {
        long[] prefixSum = PrefixSum.prefixSum(arr);
        int N = arr.length;
        int count = 0;
        for (int i = 0; i < N; i++) {
            long left,right;
            if (i == 0) {
                left = 0;
            } else {
                left = prefixSum[i - 1];
            }
            if(i == N-1){
                right = 0;
            }else{
                right = prefixSum[N - 1] - prefixSum[i];
            }
            if (left == right) {
                count = count + 1;
            }
        }
        return count;
    }
}
