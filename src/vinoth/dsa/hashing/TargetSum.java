package vinoth.dsa.hashing;

import java.util.HashSet;
import java.util.Set;

public class TargetSum {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 1, 2, 3};
        int k = 90;
        System.out.println(targetSum(arr, k));
        System.out.println(targetSumHashSet(arr, k));
    }

    //bruteforce
    private static boolean targetSum(int[] arr, int k) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean targetSumHashSet(int[] arr, int k) {
        int N = arr.length;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (hashSet.contains(k - arr[i])) {
                return true;
            } else {
                hashSet.add(arr[i]);
            }
        }
        return false;
    }

}
