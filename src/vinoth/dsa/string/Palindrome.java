package vinoth.dsa.string;

public class Palindrome {

    //two pointer
    public static boolean isPalindrome(String input, int start, int end) {
        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length()-1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("qqqmadamygygg", 3, 7));
        System.out.println(isPalindrome("ma0m"));
    }
}
