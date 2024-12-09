package vinoth.dsa.math;

public class GCD {
    public static int gcd(int a, int b) {
        int min = Math.min(a, b);
        while (min > 0) {
            if (a % min == 0 && b % min == 0) {
                return min;
            }
            min--;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(gcd(64, 18));
    }
}
