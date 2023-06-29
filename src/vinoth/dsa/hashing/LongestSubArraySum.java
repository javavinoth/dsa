package vinoth.dsa.hashing;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int[] arr = {3, 2, -1};
        System.out.println(bruteforce(arr));
    }

    private static int bruteforce(int[] arr) {
        int N = arr.length;
        int ZERO = 0;
        int MAX = Integer.MIN_VALUE;
        for (int start = 0; start < N; start++) {
            int sum = 0;
            for (int end = start; end < N; end++) {
                for (int i = start; i <= end; i++) {
                    sum = sum + arr[i];
                }

            }
            if (sum == ZERO) {
//                MAX = end;
            }
        }
        return MAX;
    }
}
