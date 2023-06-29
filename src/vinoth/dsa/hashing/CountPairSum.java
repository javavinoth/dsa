package vinoth.dsa.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class CountPairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};
        int k = 3;
        System.out.println(solve(arr, k));
        System.out.println(countPairSumHashSet(arr, k));
    }

    private static int countPairSum(int[] arr, int k) {
        int N = arr.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == k) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private static int countPairSumHashSet(int[] arr, int k) {
        int N = arr.length;
        int sum = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = k - arr[i];
            if (hashMap.containsKey(key)) {
                sum = sum + hashMap.get(key);
            }
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);

        }
        int mod = 1000000007;
        return sum % mod;
    }

    public static int solve(int[] A, int B) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        final int mod = (int) (1e9 + 7);
        long ans = 0;
        for (int i = 0; i < A.length; i++) {
            if (freq.containsKey(B - A[i])) {
                ans = (ans + freq.get(B - A[i])) % mod;
            }
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }
        return (int) (ans);
    }
}
