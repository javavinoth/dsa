package vinoth.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        // HashMap to store the last seen index of each character
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;  // Variable to store the maximum length of the substring
        int left = 0;  // Left pointer of the sliding window

        // Iterate through the string
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map and within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                // Move the left pointer to the right of the last seen position of the current character
                left = map.get(currentChar) + 1;
            }

            // Update the last seen index of the current character
            map.put(currentChar, right);

            // Calculate the length of the current window and update maxLength if it's larger
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;  // Return the maximum length found
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + length);
    }
}
