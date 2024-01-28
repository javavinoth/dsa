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

    public static boolean isPalindrome(String str) {
        // Base case: if the string is empty or has only one character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Compare the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recur for the substring between the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    //reverse entire and compare
    public static boolean isPalindromeRev(String input) {
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

    private static int longestPalindrome(String input) {

        int even = 0, odd = 0;
        for (int i = 0; i < input.length(); i++) {
            int p1 = i, p2 = i;
            int length = expand(p1, p2, input);
            odd = Math.max(odd, length);
        }
        for (int i = 0; i < input.length(); i++) {
            int p1 = i, p2 = i + 1;
            int length = expand(p1, p2, input);
            even = Math.max(even, length);
        }
        return Math.max(even, odd);
    }

    private static int expand(int p1, int p2, String input) {
        while (p1 > 0 && p2 < input.length() && input.charAt(p1) == input.charAt(p2)) {
            p1--;
            p2++;
        }
        return (p2 - p1 - 1);
    }

    public static void main(String[] args) {
        String madaam = "acab";
//        System.out.println(isPalindrome(madaam));
        System.out.println(longestPalindrome(madaam));
//        System.out.println(isPalindrome(madaam, 0, madaam.length() - 1));
        System.out.println(findLongestPalindrome(madaam));
    }
    public static int findLongestPalindrome(String str) {
        int n = str.length();
        boolean[][] isPalindrome = new boolean[n][n];

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        int start = 0; // Start index of the longest palindromic substring
        int maxLength = 1; // Length of the longest palindromic substring

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for palindromes of length greater than 2
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1; // Ending index of the current substring

                // Check if the current substring is a palindrome
                if (isPalindrome[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    isPalindrome[i][j] = true;

                    // Update if the current palindrome is longer than the previously known longest palindrome
                    if (len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }

        // Extract and return the longest palindromic substring
        return str.substring(start, start + maxLength).length();
    }
}
