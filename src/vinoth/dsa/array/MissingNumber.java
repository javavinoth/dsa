package vinoth.dsa.array;

public class MissingNumber {

    public static int missingNo(int[] arr) {
        int N = arr[arr.length - 1];
        int sumOfNaturalNo = (N * (N + 1)) / 2;
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sumOfNaturalNo - sum;
    }

    public static int missingNumber(int[] a, int N) {
        //N is maximum
        int sum = (N * (N + 1)) / 2;

        int s2 = 0;
        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        return sum - s2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int[] ar = {2, 19, 10, 1, 5, 3, 13, 18, 24, 23, 9, 22, 28, 25, 6, 27, 4, 20, 21, 26, 11, 8, 17, 15, 16, 12, 7, 14};

        System.out.println(missingNo(arr));
        System.out.println(missingNumber(ar, 29));
    }
}
