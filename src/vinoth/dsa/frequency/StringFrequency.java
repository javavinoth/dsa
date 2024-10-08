package vinoth.dsa.frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringFrequency {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> single = new HashMap<>();
        for (int i : nums) {
            if (single.containsKey(i)) {
                Integer value = single.get(i);
                value = value + 1;
                single.put(i, value);

            } else {
                single.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : single.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return 0;
    }

    private static Character frequency(String input) {
        char[] chars = input.toCharArray();
        Character result = null;
        Map<Character, Integer> frequency = new HashMap<>();
        for (char aChar : chars) {
            if (frequency.containsKey(aChar)) {
                frequency.put(aChar, frequency.get(aChar) + 1);
            } else {
                frequency.put(aChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    private static int freq(int[] a) {
        int result = 0;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i : a) {
            if (frequency.containsKey(i)) {
                frequency.put(i, frequency.get(i) + 1);
            } else {
                frequency.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() >= 2) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
//        frequency("aabcd");
    }
}
