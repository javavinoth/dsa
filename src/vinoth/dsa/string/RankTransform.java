package vinoth.dsa.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/rank-transform-of-an-array/description/
 */
public class RankTransform {

    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);
        int[] result = new int[arr.length];
        temp = Arrays.stream(temp)
                .distinct()
                .sorted()
                .toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            map.put(temp[i], i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        int[] rankTransform = arrayRankTransform(arr);
        Arrays.stream(rankTransform).forEach(System.out::println);
    }
}
