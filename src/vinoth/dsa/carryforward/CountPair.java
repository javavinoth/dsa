package vinoth.dsa.carryforward;

public class CountPair {

    public static void main(String[] args) {
        char[] arr = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
        System.out.println(countPairBruteforce(arr, "ag"));
        System.out.println(countPairOptimised(arr, "ag"));
    }

    //left to right iterate
    private static int countPairBruteforce(char[] arr, String key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                for (int j = i + 1; j < arr.length; j++) {
                    String value = arr[i] + "" + arr[j];
                    if (value.equals(key)) {
                        count = count + 1;
                    }
                }
            }
        }
        return count;
    }

    //right to left iterate
    private static int countPairOptimised(char[] arr, String key) {
        int count = 0;
        int ag = 0, g = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 'g') {
                g++;
            }
            if (arr[i] == 'a') {
                ag = ag + g;
            }
        }
        return ag;
    }
}
