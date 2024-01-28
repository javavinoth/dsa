package vinoth.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class PeersIslands {

    /*
    60 ? 44
    Array of integers = {60, 5, 20, 2, 10, 4, 3}.
     Find the Golden number (number greater than the total sum of all numbers on the right of it)
     */
    /*
    1. total sum for all elems {60, 65, 85,87,97,103,106}
    2. check current postion with right
     */
    //(arr,0,7)
    //

    //    O(n)
    private static int sumAll(int[] arr, int start, int end) {
        int prefixSum = 0;
        for (int i = start; i < end; i++) {
            prefixSum = prefixSum + arr[i];
        }
        return prefixSum;
    }

    //O(n)
    private static int[] findGoldenNumber(int[] arr) {
        int[] goldenNumbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int start = i + 1;
            int end = arr.length;
            int rightSumAll = sumAll(arr, start, end);
            if (rightSumAll < arr[i]) {
                //golden number
                goldenNumbers[i] = arr[i];
            }

        }
        return goldenNumbers;
    }

    /**
     * E.x. I am very good at programming and I am looking for job change. I AM VerY GooD AT ProgramminG AnD I AM LookinG FoR JoB ChangE.
     * 1. splitby space
     */
    private static String makeCapital(String input) {
        Stream<String> stringStream = Arrays.stream(input.split(" ")).map(s -> {
            String first = String.valueOf(s.charAt(0)).toUpperCase();
            String second = s.substring(1);
            first.concat(second);
            return first;
        });
        return stringStream.toString();
    }

    public static void main(String[] args) {
        int[] arr = {60, 5, 20, 2, 10, 4, 3};
        int[] goldenNumber = findGoldenNumber(arr);
        for (int i = 0; i < goldenNumber.length; i++) {
            System.out.println(goldenNumber[i]);
        }
    }
}
