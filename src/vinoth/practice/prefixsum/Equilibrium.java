package vinoth.practice.prefixsum;

public class Equilibrium {

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 5, 4};
//        int[] arr = {23, 32, 20, 3};
        System.out.println(isEquilibrium(arr));
    }

    public static int isEquilibrium(int[] arr) {
        int[] prefixSum = prefixSum(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && (prefixSum[i] + prefixSum[i - 1]) == prefixSum[prefixSum.length - 1])
                return i;
        }
//        int mid = arr.length / 2;

        return -1;
    }

    private static int[] prefixSum(int[] arr) {
        int[] pf = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sum = sum + arr[i];
                pf[i] = sum;
            } else {
                sum = sum + arr[i];
                pf[i] = sum;
            }
        }
        return pf;
    }
}
