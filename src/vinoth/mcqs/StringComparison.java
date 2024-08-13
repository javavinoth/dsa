package vinoth.mcqs;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class StringComparison {

    public static String difference(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Add characters of str1 to set1
        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        // Add characters of str2 to set2
        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        // Remove all characters of str2 from set1
        set1.removeAll(set2);

        return set1.toString();
    }

    public static String differencse(String str1, String str2) {
        Map<Character, Integer> diff = new ConcurrentHashMap<>();

        for (char c : str1.toCharArray()) {
            if (diff.containsKey(c)) {
                Integer i = diff.get(c);
                diff.put(c, i + 1);
            } else {
                diff.put(c, 1);
            }
        }
        for (char c : str2.toCharArray()) {
            if (diff.containsKey(c)) {
                Integer i = diff.get(c);
                diff.put(c, i + 1);
            } else {
                diff.put(c, 1);
            }
        }
        diff.forEach((k, v) -> {
            if (v % 2 != 0) {
                System.out.println(k + ": " + v);
            } else {
                diff.remove(k);
            }
        });
        return diff.keySet().toString();
    }

    public static void main(String[] args) {
        String one = "onet";
        String two = "onetj";
        System.out.println(differencse(one, two));
        System.out.println(equals(one, two));
        System.out.println(byChar(one, two));
        System.out.println(byCompareTo(one, two));
    }

    public static boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static boolean byChar(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean byCompareTo(String str1, String str2) {
        return str1.compareTo(str2) == 0;
    }

}
