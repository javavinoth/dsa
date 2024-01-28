package vinoth.leetcode.arrays.subarray;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/continuous-subarray-sum/description/
 */
public class ContinuousSubarraySum {


    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // if the remainder sum % k occurs for the first time
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i + 1);
                // if the subarray size is at least two
            else if (hashMap.get(sum % k) < i)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {5, 0, 0, 0};
        System.out.println(checkSubarraySum(arr, 3));
    }
}
