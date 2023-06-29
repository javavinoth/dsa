package vinoth.dsa.hashing;

import java.util.HashSet;
import java.util.Set;

public class TargetDifference {

    public static void main(String[] args) {
        int[] arrDiff = {90, 497, -411, 990, 145, 353, 314, -349, -260, -956, 258, -665, -241, 192, 605, 264, -819, -497, 829, 775, -392, 292, 997, 549, 556, 561, 627, -533, 541, -871, 240, 813, 174, -399, -923, -785};
        int kDiff = -466;
        System.out.println(targetDiff(arrDiff, kDiff));
    }

    //bruteforce
    private static boolean targetDiff(int[] arr, int k) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] - arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean targetSubDiff(int[] arr, int k) {
        int N = arr.length;
        long sum = 0;
        HashSet<Long> hashSet = new HashSet<>();
        hashSet.add(0L);
        for (int i = 0; i < N; i++) {
            sum = sum + arr[i];
            if (hashSet.contains(arr[i] - k)) {
                return true;
            }
            hashSet.add(sum);
        }
        return false;
    }

    private static boolean targetDiffHashSet(int[] arr, int k) {
        int N = arr.length;
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (hashSet.contains(arr[i] - k) || hashSet.contains(k + arr[i])) {
                return true;
            }
            hashSet.add(arr[i]);
        }
        return false;
    }

    public int solve(int[] A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i] + B) || set.contains(A[i] - B)) {
                return 1;
            }
            set.add(A[i]);
        }
        return 0;
    }
}
