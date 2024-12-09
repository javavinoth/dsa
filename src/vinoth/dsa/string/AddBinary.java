package vinoth.dsa.string;

/*
https://leetcode.com/problems/add-binary/description/
 */
public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0'; // convert '0' or '1' to integer
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2); // Append the binary digit (0 or 1)
            carry = sum / 2; // Calculate the carry
        }

        if (carry != 0) result.append(carry); // Append remaining carry if any

        return result.reverse().toString(); // Reverse the result to get the correct order
    }

    public static void main(String[] args) {
        String result = addBinary("11", "1");
        System.out.println(result);
    }
}
