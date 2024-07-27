package vinoth.dsa.array;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.addAll;

public class FindCommon {

    public static List<Integer> common(int[] arr1, int[] arr2) {
        List<Integer> common = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                common.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else j++;
        }
        return common;
    }

    public static Set<Integer> union(int[] arr1, int[] arr2) {
        Set<Integer> ar1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        ar1.addAll(Arrays.stream(arr2).boxed().collect(Collectors.toSet()));
        return ar1;
    }

    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
//        List<Integer> common = common(arr1, arr2);
//        Set<Integer> union = union(arr1, arr2);
//        common.forEach(System.out::println);
//        System.out.println("==============");
//        union.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(2, "b");
        map.put(1, "a");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(45, "b");
        treeMap.put(30, "a");
        map.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        treeMap.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
        int i = 153, num = 153;
        int reveresed = 0;
        int arm = 0, count = 0;
        while (i != 0) {
            // num = num/10
            i /= 10;
            ++count;
        }
        while (num != 0) {
            int last = num % 10;
            arm = (int) (arm + Math.pow(last, count));
            reveresed = reveresed * 10 + last;
            num = num / 10;
        }
        System.out.println("reveresed: " + reveresed);
        System.out.println("arm: " + arm);
    }
}
