package vinoth.dsa.recursion;

public class Fibonacci {

    public long fibonacci(long number) {
        if (number < 2)
            return number;
        return fibonacci(number - 1) + fibonacci(number - 2);

    }

    public int solve(int A) {
        if (A == 1) {
            return 1;
        }

        return A * solve(A - 1);
    }

    public static void printDecrease(int A) {
        if (A == 0) {
            System.out.println();
            return;
        }
        System.out.print(A + " ");
        printDecrease(A - 1);

    }

    public static void printIncrease(int A) {
        printIncrease(1, A);
        System.out.println();
    }

    public static void printIncrease(int start, int A) {
        System.out.print(start + " ");
        if (start < A) {
            printIncrease(start+1, A);
        }

    }

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
//        fibonacci.solve(9);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(fibonacci.fibonacci(i) + " ");
//        }
//        printDecrease(10);
        printIncrease(10);
    }
}
