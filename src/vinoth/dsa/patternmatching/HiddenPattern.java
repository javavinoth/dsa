package vinoth.dsa.patternmatching;

import java.util.Arrays;

public class HiddenPattern {

    public static int[] createLPS(String input) {
        int N = input.length();
        int[] lps = new int[N];
        lps[0] = 0;
        for (int i = 1; i < N; i++) {
            int x = lps[i - 1];
            System.out.println("i " + i + "  " + "x " + x);
            while (input.charAt(i) != input.charAt(x)) {
//                System.out.println("IN");
                if (x == 0) {
                    x = -1;
                    break;
                }
                x = lps[x - 1];
            }
            lps[i] = x + 1;
        }
        return lps;
    }

    public static int patternOccurence(String input, String pattern) {
        int N = input.length();
        int M = pattern.length();
        String s = pattern + "$" + input;
        int[] lps = createLPS(s);
        int k = 0;
        for (int i = 0; i < N; i++) {
            if (lps[i] == M) {
                k++;
            }
        }
        return k;
    }

    public static int solve(final String A, final String B) {
        int count = 0;
        int len = B.length();
        String str = B + "&" + A;

        int n = str.length();

        int[] lps = new int[n];
        lps[0] = 0;

        for (int i = 1; i < n; i++) {
            int x = lps[i - 1];
            while (str.charAt(x) != str.charAt(i)) {
                if (x == 0) {
                    x = -1;
                    break;
                }
                x = lps[x - 1];
            }

            lps[i] = x + 1;

            if (lps[i] == len) { // increase count if lps[i] is equal to the length of string B.
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Arrays.stream(createLPS("ino$vinoth")).asLongStream().forEach(System.out::println);
//        System.out.println(solve("Vinoinooinoth", "ino"));
//        System.out.println(patternOccurence("Vinoinooinoth", "ino"));
    }

//    public static int[] myTry(String input){
//        int[]lps=new int[input.length()];
//        lps[0]=0;
//        for (int i=1;i<input.length();i++){
//
//        }
//    }
}
