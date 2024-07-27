package vinoth.dsa.math;

public class CountDigits {

    public static void main(String[] args) {
        int i = 2446;
        System.out.println(countDigits(i));
        System.out.println(evenlyDivides(i));
    }

    public static int countDigits(int i) {
        int count = 0;
        while (i > 0) {
            i = i / 10;
            count++;
        }
        return count;
    }

    public static int evenlyDivides(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem != 0 && n % rem == 0)
                count++;
            n = n / 10;
        }
        return count;
    }

}
