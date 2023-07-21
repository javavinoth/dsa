package vinoth.dsa.search;

public class PeakElement {

    public static int findPeakBruteforce(int[] n) {
        int peak = 0;
        for (int i = 0; i < n.length; i++) {
            int mid = i;
            int left = i - 1 == -1 ? 0 : i - 1;
            int right = i + 1 < n.length ? i + 1 : 0;
            if (mid == left && mid == right)
                peak = n[mid];
            if (left == 0 && n[mid] > n[right])
                peak = n[mid];
            if (right == 0 && n[mid] > n[left])
                peak = n[mid];
            if (n[mid] > n[left] && n[mid] > n[right])
                peak = n[mid];
        }
        return peak;
    }

    public static void main(String[] args) {
        int[] n = {1, 1000000001, 1000000002};
        int peakBruteforce = findPeakBruteforce(n);
        System.out.println(peakBruteforce);
    }
}
