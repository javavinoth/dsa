package vinoth.dsa.search;

import java.util.HashMap;
import java.util.Map;

public class SingleElement {


    /*
        TIme complexity = O(n)
     */
    private static int bruteforce(int[] a) {
        int result = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i : a) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() < 2) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    /*
        Time complexity = O(log n)
        It will work only 2 continuous element are same
     */
    private static int findSingleElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is even, the single element is on the right side.
            // If mid is odd, the single element is on the left side.
            if (mid % 2 == 1) {
                mid--;  // Adjust mid to make it even.
            }

            if (nums[mid] != nums[mid + 1]) {
                // The single element is on the left side.
                right = mid;
            } else {
                // The single element is on the right side.
                left = mid + 2;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(findSingleElement(nums));
        System.out.println(bruteforce(nums));
    }
}
