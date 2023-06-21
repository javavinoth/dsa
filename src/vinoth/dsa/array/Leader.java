package vinoth.dsa.array;

public class Leader {

    public static void main(String[] args) {
        int[] ar = {3, 2, 4, 5, 2, 7, -1, 15};
        System.out.println(bf(ar));
        System.out.println(op(ar));
    }

    private static int bf(int[] ar) {
        int N = ar.length;
        int l = 1;
        for (int i = 1; i < N; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                if (max < ar[j]) {
                    max = ar[j];
                }
            }
            if (ar[i] > max) {
                l = l + 1;
            }
        }
        return l;
    }

    private static int op(int[] ar) {
        int N = ar.length, l = 1;
        int max = ar[0];
        for (int i = 1; i < N; i++) {
            if (max < ar[i]) {
                max = ar[i];
                l = l + 1;
            }
        }
        return l;
    }
}
