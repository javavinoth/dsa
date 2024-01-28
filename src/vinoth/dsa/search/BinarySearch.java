package vinoth.dsa.search;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BinarySearch {
    private static int binarySearch(Object[] a, int fromIndex, int toIndex,
                                    Object key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable midVal = (Comparable) a[mid];
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Element found at index mid
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        String[] arr = {"vinoth", "malathy", "thooriga", "muthu"};
//        System.out.println(binarySearch(Arrays.stream(arr).sorted().toArray(), 0, arr.length, "muthu"));
        int[] a = {5, 1, 3, 4};
        Arrays.sort(a);
        BiFunction<int[], Integer, Integer> integerIntegerBiFunction = BinarySearch::binarySearch;
        System.out.println(integerIntegerBiFunction.apply(a, 4));
//        System.out.println(binarySearch(Arrays.stream(a).boxed().toArray(),0,a.length,4));
    }
}
