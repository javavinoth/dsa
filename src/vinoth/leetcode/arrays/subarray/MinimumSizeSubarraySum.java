package vinoth.leetcode.arrays.subarray;

/*
https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */
public class MinimumSizeSubarraySum {

    public static int minimumSizeSubarraySum(int target, int[] nums) {
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum = sum + nums[end];
                if (sum == target) {
                    return (end - start) + 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minimumSizeSubarraySum(target, arr));
    }
}
