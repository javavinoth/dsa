package vinoth.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            smap.put(s.charAt(i), t.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), s.charAt(i));

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(smap.get(s.charAt(i)));
        }
        StringBuilder tb = new StringBuilder();
        for (int i = 0; i < t.length(); i++) {
            tb.append(tmap.get(t.charAt(i)));
        }
        if (!sb.toString().equals(t))
            return false;
        return tb.toString().equals(s);
    }

    public static boolean isIsomorphicOp(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (!map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            } else if (map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphicOp(s, t));
    }
}
