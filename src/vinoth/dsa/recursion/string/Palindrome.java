package vinoth.dsa.recursion.string;

public class Palindrome {

    //recursive
    public static boolean isPalindrome(String input, int i, int j) {
        if (i >= j) return true;   // base condition
        if (input.charAt(i) == input.charAt(j)) {
            return isPalindrome(input, i + 1, j - 1); // main logic
        } else {
            return false;
        }
    }

    //reverse entire and compare
    public static boolean isPalindrome(String input) {
        return input.equals(new StringBuilder(input).reverse().toString());
    }


    public int solve(String input) {
        int n = input.length();
        if (isPalindrome(input, 0, n - 1)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

    }
}
