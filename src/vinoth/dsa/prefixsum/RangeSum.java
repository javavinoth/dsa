package vinoth.dsa.prefixsum;

/*
https://leetcode.com/problems/range-sum-query-immutable/description/
 */
public class RangeSum {
    private int[] prefixSums;
    private long[] prefixSums1;

    public RangeSum(int[] nums) {
        prefixSums1 = PrefixSum.prefixSum(nums);
        prefixSums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSum rangeSum = new RangeSum(nums);
        long sumRange = rangeSum.sumRange(2, 5);
        System.out.println(sumRange);
    }

    public long sumRange(int left, int right) {
        if (left == 0) {
            return prefixSums1[right];
        }
        return prefixSums1[right] - prefixSums1[left - 1];
    }
}
