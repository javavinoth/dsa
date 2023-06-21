package vinoth.dsa.subarray;

public class CountSubarray {

    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 3};
        int index = 1;
        System.out.println(count(arr, index));
        System.out.println(count(arr));
        System.out.println(countOptimized(arr));
    }

    //count all subarrays
    private static int count(int[] arr) {
        int count = 0;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                count = count + 1;
            }
        }
        return count;
    }
    //count all subarrays
    private static int countOptimized(int[] arr) {
        int N = arr.length;
        return (N * (N + 1) / 2);
    }

    private static int count(int[] arr, int index) {
        int count = 0;
        for (int i = index; i <= arr.length; i++) {
            count = count + 1;
        }
        return count;
    }
}
