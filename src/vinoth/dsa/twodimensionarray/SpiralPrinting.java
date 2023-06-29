package vinoth.dsa.twodimensionarray;

import java.util.Scanner;

public class SpiralPrinting {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) mat[i][j] = s.nextInt();

        int i = 0, j = 0;
        while (n > 1) {
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]);
                System.out.print(" ");
                j++;
            }
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]);
                System.out.print(" ");
                i++;
            }
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]);
                System.out.print(" ");
                j--;
            }
            for (int k = 1; k < n; k++) {
                System.out.print(mat[i][j]);
                System.out.print(" ");
                i--;
            }
            i++;
            j++;
            n -= 2;
        }
        if (n == 1) {
            System.out.print(mat[i][j]);
            System.out.print(" ");
        }
        System.out.println("");

    }
}