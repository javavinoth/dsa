package vinoth.dsa.string;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagram {

    public static Map<Character, Long> frequency(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static boolean isAnagramMap(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Long> sMap = frequency(s);
        Map<Character, Long> tMap = frequency(t);
        return sMap.equals(tMap);
    }

    public static boolean isAnagramArray(String s, String t) {
        char[] sLets = s.toCharArray();
        char[] tLets = t.toCharArray();

        Arrays.sort(sLets);
        Arrays.sort(tLets);
        return Arrays.equals(sLets, tLets);
    }

    public static void main(String[] args) {
        System.out.println(isAnagramMap("anagram", "nagaram"));
        System.out.println(isAnagramArray("anagram", "nagaram"));
    }
}
