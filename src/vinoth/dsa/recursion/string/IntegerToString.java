package vinoth.dsa.recursion.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerToString {

    public static int[] convert(String s) {
        int[] i = new int[s.length()];
        for (int j = 0; j < s.length(); j++) {
            //ASCI number minus ASCI zero return int real input number
            i[j] = s.charAt(j) - '0'; // or Character.getNumericValue(s.charAt(j));
        }
        return i;
    }

    public static void printAllSubArray(int[] arr) {
        int N = arr.length;
        for (int start = 0; start < N; start++) {
            for (int end = start; end < N; end++) {
                for (int i = start; i < end; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }
    }

    public static List<int[]> getAllSubarrays(int[] arr) {
        List<int[]> subarrays = new ArrayList<>();

        // Outer loop for the starting point
        for (int start = 0; start < arr.length; start++) {
            // Inner loop for the ending point
            for (int end = start; end < arr.length; end++) {
                // Create a subarray from arr[start] to arr[end]
                int[] subarray = new int[end - start + 1];
                for (int k = start; k <= end; k++) {
                    subarray[k - start] = arr[k];
                }
                // Add the subarray to the list
                subarrays.add(subarray);
            }
        }

        return subarrays;
    }

    public static void main(String[] args) {
        int[] ints = convert("12345");
        System.out.println(Arrays.toString(ints));
        List<int[]> allSubarrays = getAllSubarrays(ints);
        allSubarrays.forEach(i -> System.out.println(Arrays.toString(i)));
    }
}
