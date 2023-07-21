package vinoth.dsa.search;

import java.util.ArrayList;
import java.util.List;

/*
Given a sorted array of integers A (0-indexed) of size N, find the left most and the right most index of a given integer B in the array A.

Return an array of size 2, such that
          First element = Left most index of B in A
          Second element = Right most index of B in A.
If B is not found in A, return [-1, -1].

Note : Your algorithm's runtime complexity must be in the order of O(log n).
 */
public class RangeSearch {


    /*
        time complexity = O(n)
        two pointer moves opposite direction
     */
    public static ArrayList<Integer> searchRangeBruteForce(final List<Integer> values, int key) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        result.add(-1);
        if (values.size() < 2) {
            result.set(0, 0);
            result.set(1, 0);
            return result;
        }

        for (int start = 0, end = values.size() - 1; start < values.size();
             start++, end--) {
            if (result.get(0) != -1 && result.get(1) != -1) {
                break;
            }
            if (values.get(start) == key && result.get(0) == -1) {
                result.set(0, start);
            }
            if (values.get(end) == key && result.get(1) == -1) {
                result.set(1, end);
            }
        }
        return result;
    }

    /*
        time complexity = O(log n)
        binary search
     */
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int low, up;
        ArrayList<Integer> res = new ArrayList<>();
        low = lowerBound(A, 0, A.size() - 1, B);
        if (low == -1) {
            res.add(-1);
            res.add(-1);
            return res;
        }
        up = upperBound(A, 0, A.size() - 1, B);
        res.add(low);
        res.add(up);
        return res;
    }

    public int lowerBound(final List<Integer> A, int start, int end, int num) {
        int steps = end - start + 1;
        int mid;
        int low = -1;
        int val;
        while (steps > 0) {
            mid = (start + end) / 2;
            val = A.get(mid);
            if (num < val)
                end = mid - 1;
            else if (num > val)
                start = mid + 1;
            else {
                low = mid;
                end = mid - 1;
            }
            steps /= 2;
        }
        return low;
    }

    public int upperBound(final List<Integer> A, int start, int end, int num) {
        int steps = end - start + 1;
        int mid;
        int up = end + 1;
        int val;
        while (steps > 0) {
            mid = (start + end) / 2;
            val = A.get(mid);
            if (num < val)
                end = mid - 1;
            else if (num > val)
                start = mid + 1;
            else {
                up = mid;
                start = mid + 1;
            }
            steps /= 2;
        }
        return up;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 7, 7, 8, 8, 10);
        ArrayList<Integer> searchRangeBruteForce = searchRangeBruteForce(integers, 8);
        ArrayList<Integer> searchRange = searchRangeBruteForce(integers, 8);
        System.out.println(searchRangeBruteForce);
        System.out.println(searchRange);
    }
}
