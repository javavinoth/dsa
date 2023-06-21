package vinoth.dsa.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Difference {

    public static void main(String[] args) {
        System.out.println(bitManipulation("abc", "abcd"));
        System.out.println(asciiSum("abcd", "abc"));
        System.out.println(hashMap("abcde", "abcf"));
    }

    public static char bitManipulation(String one, String two) {
        char c = 0;
        for (char cs : one.toCharArray()) c ^= cs;
        for (char ct : two.toCharArray()) c ^= ct;
        return c;
    }

    public static String hashMap(String one, String two) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : one.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : two.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        map.values().removeIf(v -> (v % 2 == 0));
        return map.keySet().stream().map(String::valueOf).collect(Collectors.joining());
    }

    public static char asciiSum(String one, String two) {
        int sumOne = 0;
        int sumTwo = 0;
        for (int i = 0; i < one.length(); i++) {
            char ch = one.charAt(i);
            sumOne += ch;
        }
        for (int i = 0; i < two.length(); i++) {
            char ch = two.charAt(i);
            sumTwo += ch;
        }
        return (char) (sumTwo - sumOne);
    }
}
