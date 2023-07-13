package vinoth.dsa.recursion;

public class SumOfDigit {
    private static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int div = n / 10;
        int mod = n % 10;
        int k = sumOfDigit(div) + mod;
        System.out.println(k);
        return k;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(460));
    }
}
