package vinoth.dsa.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        Optional<Character> frequency = frequency(s);
        return frequency.map(s::indexOf).orElse(-1);
    }

    public static Optional<Character> frequency(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .limit(1).map(Map.Entry::getKey).findFirst();
    }

    public static int firstUniqCharOp(String s) {
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqCharOp("leetcode"));
    }
}
