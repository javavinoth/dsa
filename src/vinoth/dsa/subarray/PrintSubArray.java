package vinoth.dsa.subarray;

import vinoth.dsa.prefixsum.PrefixSum;

public class PrintSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 3;
        int length = 3;
//        printSubArray(arr, start, end);
//        System.out.println();
//        printSubArrayWithLength(arr, start, length);
//        printAllSubArray(arr);
//        printSumOfAllSubArray(arr);
        System.out.println("***********");
//        printSumOfAllSubArrayOptimised(arr);
        maxSubArraySum(arr);
        maxSubArraySumWithPrefix(arr);
    }

    public static void printSubArray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void printSubArrayWithLength(int[] arr, int start, int length) {
        int end = (start + length) - 1;
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void printAllSubArray(int[] arr) {
        int N = arr.length;
        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                for (int i = start; i < end; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }

    public static void printSumOfAllSubArray(int[] arr) {
        int N = arr.length;
        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum = sum + arr[i];
                }
                System.out.println("sum " + sum);
            }
        }
    }

    public static void printSumOfAllSubArrayOptimised(int[] arr) {
        int N = arr.length;
        long[] prefixSum = PrefixSum.prefixSum(arr);
        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                long sum = 0;
                if (start == 0) {
                    sum = prefixSum[end];
                } else {
                    sum = prefixSum[end] - prefixSum[start - 1];
                }
                System.out.println("sum " + sum);
            }
        }
    }

    public static void maxSubArraySum(int[] arr) {
        int N = arr.length;
        long max = Long.MIN_VALUE;
        for (int start = 0; start < N; start++) {
            long sum = 0;
            for (int end = start; end < N; end++) {
                sum = sum + arr[end];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("max " + max);
    }

    public static void maxSubArraySumWithPrefix(int[] arr) {
        int N = arr.length;
        long[] prefixSum = PrefixSum.prefixSum(arr);
        long max = Long.MIN_VALUE;
        for (int start = 0; start < N; start++) {
            long sum = 0;
            for (int end = start; end < N; end++) {
                if (start == 0) {
                    sum = prefixSum[end];
                } else {
                    sum = prefixSum[end] - prefixSum[start - 1];
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("max " + max);
    }
}
