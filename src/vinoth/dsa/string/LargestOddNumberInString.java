package vinoth.dsa.string;

public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        // Start from the end of the string
        for (int i = num.length() - 1; i >= 0; i--) {
            // Check if the current digit is odd
            if ((num.charAt(i) - '0') % 2 != 0) {
                // Return the substring from start to the current index (inclusive)
                return num.substring(0, i + 1);
            }
        }
        // If no odd number is found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        LargestOddNumberInString solution = new LargestOddNumberInString();

        String num1 = "52";
        String num2 = "4206";
        String num3 = "35427";

        System.out.println(solution.largestOddNumber(num1));  // Output: "5"
        System.out.println(solution.largestOddNumber(num2));  // Output: ""
        System.out.println(solution.largestOddNumber(num3));  // Output: "35427"
    }
}
