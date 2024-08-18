package vinoth.leetcode.arrays.subarray;

/*
https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {

    public static int subArraySumBruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    //Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Update the current maximum to be either the current element itself,
            // or the maximum we can get by extending the previous subarray.
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update the global maximum if the current maximum is greater.
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static int subArraySumBruteForce2(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum = sum + arr[end];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1};
        System.out.println(subArraySumBruteForce(arr));
        System.out.println(maxSubArray(arr));
    }


}
