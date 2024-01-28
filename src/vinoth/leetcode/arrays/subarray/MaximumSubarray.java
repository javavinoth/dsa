package vinoth.leetcode.arrays.subarray;

/*
https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {

    public static int subArraySumBruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            for (int end = 0; end < arr.length; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        System.out.println(subArraySumBruteForce(arr));
    }


}
