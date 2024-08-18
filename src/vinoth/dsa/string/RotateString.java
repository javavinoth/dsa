package vinoth.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class RotateString {

    public static boolean leftRotate(String s, String goal) {
        List<String> values = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char leftChar = s.charAt(0);
            s = s.substring(1) + leftChar;
            values.add(s);
        }
        return values.contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(leftRotate("abcde", "abced"));
    }
}
