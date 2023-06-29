package vinoth.dsa.hashing;

import java.util.HashMap;
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

    public static int diffPair(int[] arr, int k) {
        int N = arr.length;
        long sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        for (int i = 0; i < N; i++) {
            sum = sum + arr[i];
            if (hashMap.containsKey(arr[i] - k)) {
                count++;
            }
            if (hashMap.containsKey(arr[i])) {
                Integer integer = hashMap.get(arr[i]);
                hashMap.put(arr[i], integer++);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
        return count;
    }

    public int solveSolution(int[] A, int B) {
        int N = A.length;
        int modulus = 1000000000 + 7;
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        // First Case:   A[i] - A[j] = B => A[j] = A[i] -B
        // Second Case:  A[i] - A[j] = B => A[i] = B + A[j]
        for (int i = 0; i < N; i++) {
            int x = A[i] - B;
            int y = B + A[i];

            if (hm.containsKey(x)) {
                count = count + hm.get(x);
            }
            if (hm.containsKey(y)) {
                count = count + hm.get(y);
            }

            // Insert A[i]
            if (hm.containsKey(A[i])) {
                int value = hm.get(A[i]);
                hm.put(A[i], value + 1);
            } else {
                hm.put(A[i], 1);
            }
        }
        return (int) (count % modulus);
    }

    public static int solution(int[] A, int B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int val : A) {
            if (map.containsKey(val - B))
                count = count + map.get(val - B);
            if (map.containsKey(val + B))
                count = count + map.get(val + B);
            if (map.containsKey(val))
                map.put(val, map.get(val) + 1);
            else
                map.put(val, 1);
        }
        return count % 1000000007;
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
