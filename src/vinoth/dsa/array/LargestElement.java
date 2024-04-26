package vinoth.dsa.array;

/*
https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
 */
public class LargestElement {

    public static int op(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }



    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 7, 9};
        System.out.println(op(arr));
    }
}
