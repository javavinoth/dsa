package vinoth.dsa.recursion;

public class Fibonacci {

    public long fibonacci(long number) {
        if (number < 2)
            return number;
        return fibonacci(number - 1) + fibonacci(number - 2);

    }

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci.fibonacci(i) + " ");
        }
    }
}
