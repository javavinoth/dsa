package vinoth.dsa.recursion;

public class Factorial {
    public long factorial(long number) {
        if (number <= 1) //terminate step
            return 1;
        return number * factorial(number - 1);//recursive
    }

    public static void main(String[] args) {
        long input = 5;
        Factorial factorial = new Factorial();
        long result = factorial.factorial(input);
        System.out.printf("input: %d, output: %d", input, result);
    }
}
