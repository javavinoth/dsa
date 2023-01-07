package vinoth.dsa.recursion.backtracking;

import java.util.Arrays;

public class BinaryString {

    int[] A;

    public BinaryString(int arrayLength) {
        A = new int[arrayLength];
    }

    public void binaryString(int input) {
        if (input <= 0)
            System.out.println(Arrays.toString(A));
        else {
            A[input - 1] = 0;
            binaryString(input - 1);
            A[input - 1] = 1;
            binaryString(input - 1);
        }
    }

    public static void main(String[] args) {
        int length = 2;
        BinaryString binaryString = new BinaryString(length);
        binaryString.binaryString(length);
    }
}
