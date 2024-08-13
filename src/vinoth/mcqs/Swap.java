package vinoth.mcqs;

public class Swap {

    public static void swapAddSub(int a, int b) {
        try {
            a = a + b;
            b = a - b;
            a = a - b;
        } finally {
            System.out.println("a: " + a + " b: " + b);
        }

    }

    public static void swapMultiplyDivision(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void swapBitwise(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + " b: " + b);
    }

    public static void main(String[] args) {
        swapAddSub(-1, 2);
        swapMultiplyDivision(-1, 2);
        swapBitwise(-1, 2);
    }
}
