package vinoth.interviews;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MagicEdtech {
    static Predicate<Integer> oddPredicate = n -> {
        boolean b = n % 2 != 0;
        return b;
    };

    /**
     * sum of square of odd numbers
     * Ex: {1.....n}
     * 1,3,5=> 1+9+25=ans
     */
    // a(0)  ,  2 ---> hashmap collision
    // b(0) , 1 -->
    // a == 1
    public static int logic(List<Integer> input) {
//        Predicate<Integer> evenPredicate = n -> n % 2 == 0;

        return input.stream().filter(oddPredicate).map(n -> n * n).mapToInt(Integer::intValue).sum();

//        List<Integer> integers = input.stream().filter(i -> i % 2 != 0)
//                .map(integer -> integer * integer).toList();
//        int total = 0;
//        for (Integer i : integers
//        ) {
//            total = total + i;
//        }
//        return total;
    }

    public static void main(String[] args) {
        //select slary from table
        logic(List.of(1, 2, 3, 4, 5, 6));
//        UtilInterface.toLowerCase("d");
    }
}
