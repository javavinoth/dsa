package vinoth.java.eight;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static BiPredicate<String, String> patternMatching = (input, pattern) -> {
        for (int i = 0; i < input.toCharArray().length; i++) {
            if (input.charAt(i) == pattern.charAt(0) && (input.substring(i, pattern.length() + i).equals(pattern))) {
                return true;
            }
        }
        return false;
    };

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("malathy");
        Employee e2=new Employee();
        e2.setId(1);
        e2.setName("thoori");
        Employee e3=new Employee();
        e3.setId(1);
        e3.setName("amma");
        List<Employee> employeeList = Arrays.asList(e1, e2, e3);
        Collections.sort(employeeList, Comparator.comparing(Employee::getId).thenComparing(Employee::getName));
        System.out.println(employeeList);
//        Collections.reverse(employeeList);
//        System.out.println(employeeList);
        String s="viinoth";
        Map<String,Integer>map=new HashMap<>();
//        Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(Collections.frequency(Collections.singleton("viinoth"),"i"));
//        System.out.println("lower: " + UtilInterface.toLowerCase("VINOTH"));
//        System.out.println("upper: " + UtilInterface.toUpperCase("vinoth"));
//        System.out.println(patternMatching.test("vinoth", "ino"));
        List<Integer> integers = List.of(1, 2, 3, 4);
//        System.out.println(integers.stream().max(Integer::compareTo).get());
//        System.out.println(
//        integers.stream().sorted(Comparator.reverseOrder())
//                .limit(3).skip(2).findFirst().get());
//                forEach(System.out::println);
//        integers.stream().collect(Collectors.toSet());
//        System.out.println(findCountOfChars("aAabc"));

    }

    public static Map<String, Long> findCountOfChars(String s) {
        Map<String, Long> map = Arrays.stream(s.split(""))
                .collect(Collectors
                        .groupingBy(str -> str,
                                Collectors.counting()));
        return map;
    }
}
