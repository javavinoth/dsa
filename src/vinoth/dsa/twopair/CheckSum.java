package vinoth.dsa.twopair;

public class CheckSum {

    private static boolean checkSum(int[] a, int k) {
        int p1 = 0;
        int p2 = a.length - 1;
        boolean result = false;
        while (p1 < p2) {
            int sum = a[p1] + a[p2];
            if (sum == k) {
                result = true;
                break;
            }
            if (k < sum) {
                --p2;
            } else {
                ++p1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {-3, 0, 1, 3, 6, 8, 11, 14, 18, 25};
        int k = 17;
        System.out.println(checkSum(a, k));
    }
}
