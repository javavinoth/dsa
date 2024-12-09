package vinoth.dsa.string;

/*
https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder(s);
        return s.contentEquals(result.reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
