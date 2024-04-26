package vinoth.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static Object[] rotate(Object[] arr, int k) {
        List<Object> list;
        for (int i = 0; i < k; i++) {
            list = new ArrayList<>();
            list.add(arr[arr.length - 1]);
            List<Object> subList = Arrays.stream(arr).toList().subList(0, arr.length - 1);
            list.addAll(subList);
            arr = list.toArray();
        }
        return arr;
    }

    public static void main(String[] args) {
        Object[] i = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Object[] rotate = rotate(i, 3);
        Arrays.stream(rotate).forEach(System.out::println);
    }
}
