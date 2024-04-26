package vinoth.dsa.array;

/*
https://takeuforward.org/data-structure/check-if-an-array-is-sorted/
 */
public class CheckIfArraySorted {

    public static boolean op(int[] arr) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            if (arr[start] <= arr[start + 1]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] arr) {
        int start = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i >= start) {
                start = i;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1};
        System.out.println(op(arr));
        System.out.println(isSorted(arr));
    }
}
