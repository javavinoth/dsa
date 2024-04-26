package vinoth.leetcode.arrays.subarray;

/*
https://leetcode.com/problems/longest-turbulent-subarray/description/
 */
public class LongestTurbulentSubarray {
    public static int longestTurbulentSubarray(int[] arr) {
        int count = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                boolean currentGreater = true;
                boolean nextGreater = true;
                for (int i = start; i <= end; i++) {
                    int current = i;
                    int next = i + 1;
                    if (start == end) {
                        count++;
                    } else if (currentGreater && arr[current] > arr[next]) {
                        currentGreater = false;
                    } else if (arr[current] < arr[next]) {
                        nextGreater = false;
                    }
                    if (!currentGreater && !nextGreater) {
                        count++;
                    }

                }
            }
        }
        return count;
    }

    public static int maxTurbulenceSize(int[] A) {
        int best = 0, clen = 0;

        for (int i = 0; i < A.length; i++) {
            if (i >= 2 && ((A[i - 2] > A[i - 1] && A[i - 1] < A[i]) ||
                    (A[i - 2] < A[i - 1] && A[i - 1] > A[i]))) {
                // If the last three elements are turbulent, increment run length by 1.
                clen++;
            } else if (i >= 1 && A[i - 1] != A[i]) {
                // The last three elements are not turbulent, so we'll reset the run length.
                // If the previous and current elements are not equal, the new run length is 2.
                clen = 2;
            } else {
                // Otherwise, the new run length is 1.
                clen = 1;
            }
            best = Math.max(best, clen);
        }
        return best;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        System.out.println(maxTurbulenceSize(arr));
    }
}
