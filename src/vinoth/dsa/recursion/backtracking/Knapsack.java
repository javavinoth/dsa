package vinoth.dsa.recursion.backtracking;

public class Knapsack {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];

        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
    }

    public  static int knapsack(int[] w, int[] v, int n, int W) {
        if (n == 0 || W == 0)
            return 0;
        if (w[n - 1] > W)
            return knapsack(w, v, n - 1, W);
        else
            return Math.max(v[n - 1] + knapsack(w, v, n - 1, W - w[n - 1]), knapsack(w, v, n - 1, W));
    }

    public static void main(String args[]) {
        int val[] = {4, 2, 10};
        int wt[] = {12, 1, 4};
        int W = 15;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n));
        System.out.println(knapsack(wt, val, n, W));
    }
}
