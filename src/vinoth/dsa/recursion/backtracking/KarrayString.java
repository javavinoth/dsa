package vinoth.dsa.recursion.backtracking;

import java.util.Arrays;

public class KarrayString {

    int[] A;

    public KarrayString(int arrayLength) {
        A = new int[arrayLength];
    }

    public void baseKStrings(int n, int k) {
        if (n <= 0)
            System.out.println(Arrays.toString(A));
        else {
            for (int j = 0; j < k; j++) {
                A[n - 1] = j;
                baseKStrings(n - 1, k);
            }
        }
    }

    public static void main(String[] args) {
        int n = 2;
        KarrayString karrayString = new KarrayString(n);
        karrayString.baseKStrings(n, 3);
    }
}
