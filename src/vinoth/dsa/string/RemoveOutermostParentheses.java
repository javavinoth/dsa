package vinoth.dsa.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class RemoveOutermostParentheses {

    public static String removeOutermostParentheses(String s) {
        char[] c = s.toCharArray();
        Set<Integer> index = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                index.add(i);
            }
        }
        for (Integer i : index) {
            c[i] = '-';
        }
        if (index.isEmpty()) {
            return "";
        }
        return new String(c).replaceAll("-", "");
    }

    public static void main(String[] args) {
        System.out.println(removeOutermostParentheses("(()())(())"));
    }
}
