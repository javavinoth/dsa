package vinoth.dsa.string;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
https://leetcode.com/problems/sort-characters-by-frequency/description/
 */
public class SortCharactersByFrequency {

    public static String solution(String input) {
        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        LinkedHashMap<Character, Long> collect1 = collect.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // If there's a duplicate key (unlikely in this case), keep the existing one
                        LinkedHashMap::new // Use LinkedHashMap to preserve order
                ));
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Long> entry : collect1.entrySet()) {
            long value = entry.getValue();
            while (value > 0) {
                result.append(entry.getKey());
                value--;
            }
        }
        return result.toString();
    }

    public static String stream(String input) {
        StringBuilder result = new StringBuilder();
        input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> result.append(String.valueOf(entry.getKey()).repeat(Math.toIntExact(entry.getValue()))));

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("tree"));
    }
}
