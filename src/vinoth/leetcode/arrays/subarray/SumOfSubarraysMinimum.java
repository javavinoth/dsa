package vinoth.leetcode.arrays.subarray;

import java.util.Arrays;
import java.util.Stack;

/*
Example 1:

Input: arr = [3,1,2,4]
Output: 17
Explanation:
Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4].
Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
Sum is 17.
Example 2:

Input: arr = [11,81,94,43,3]
Output: 444
 */
public class SumOfSubarraysMinimum {

    public static int bruteForce(int[] arr) {
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < length - 1; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < length; j++) {
                System.out.println("start " + i + "");
                System.out.println("end " + j + "");
                for (int k = i; k < j; k++) {
                    if (min != arr[k] && min > arr[k]) {
                        min = arr[k];
                        sum = sum + min;
                    }
                    System.out.println(arr[k]);
                }
                System.out.println("sum " + sum);
                System.out.println();
            }

        }
        return sum;
    }
    public static int printSumOfAllSubArray(int[] arr) {
        int N = arr.length;
        int sum = 0;
        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                int min = 0;
                boolean bol=true;
                for (int i = start; i <= end; i++) {
                    if(start==end){
                        min=arr[i];
                    }if(bol){
                        min=arr[i];
                        bol=false;
                    }
                    if (min>arr[i]){
                        min=arr[i];
                    }
//                    System.out.print(arr[i]+" ");
//                    sum = sum + arr[i];
                }
                sum=sum+min;
//                System.out.println("sum " + sum);
            }
        }
        return sum;
    }

    private static int subArray(int[] arr, int start, int length) {
        int end = (start + length) - 1;
        int min = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sumSubarrayMins(int[] arr) {
        final int MOD = 1000000007;
        Stack<Integer> st = new Stack<>();
        long sumOfMinimums = 0;

        for (int i = 0; i <= arr.length; i++) {
            while (!st.empty() && (i == arr.length || arr[st.peek()] >= arr[i])) {
                int mid = st.pop();
                int leftBoundary = st.empty() ? -1 : st.peek();
                int rightBoundary = i;

                long count = (mid - leftBoundary) * (rightBoundary - mid) % MOD;

                sumOfMinimums += (count * arr[mid]) % MOD;
                sumOfMinimums %= MOD;
            }
            st.push(i);
        }

        return (int) sumOfMinimums;
    }

    public static void main(String[] args) {
//        int[] arr = {3, 1, 2, 4};
        int[] arr = {11,81,94,43,3};
        System.out.println(printSumOfAllSubArray(arr));
//        System.out.println(bruteForce(arr));
        System.out.println(sumSubarrayMins(arr));
    }
}
