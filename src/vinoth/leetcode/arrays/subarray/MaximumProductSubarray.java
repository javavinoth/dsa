package vinoth.leetcode.arrays.subarray;

/*
https://leetcode.com/problems/maximum-product-subarray/description/
 */
public class MaximumProductSubarray {

    public static int maximumProductSubArrayBruteforce(int[] arr) {
        int L = arr.length;
        int max = Integer.MIN_VALUE;
        for (int start = 0; start < L; start++) {
            int prod = 1;
            for (int end = start; end < L; end++) {
                prod = prod * arr[end];
                max = Math.max(prod, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maximumProductSubArrayBruteforce(arr));
    }
}
