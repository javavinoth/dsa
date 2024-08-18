package vinoth.dsa.string;

import java.util.Arrays;
import java.util.Stack;

public class ReverseWords {

    public static String reverse(String s) {
        s = s.trim().replaceAll(" +", " ");
        String[] split = s.split(" ");
        Stack<String> strings = new Stack<>();
        for (String ss : split) {
            strings.push(ss);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!strings.empty()) {
            stringBuilder.append(strings.pop()).append(" ");
        }

        return stringBuilder.toString().trim();
    }

    public static String isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int left = 0, right = s.length()-1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static String reverseWords(String s) {
        // Step 1: Trim the string to remove leading and trailing spaces
        s = s.trim();

        // Step 2: Split the string into words using spaces as the delimiter
        String[] words = s.split("\\s+");

        // Step 3: Reverse the array of words
        int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Step 4: Join the words back into a single string with a single space separating them
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hi  hello vinoth kumar"));
        String input = "maim";
        String result = isPalindrome(input);
        System.out.println(result.equals(input));
    }
}
