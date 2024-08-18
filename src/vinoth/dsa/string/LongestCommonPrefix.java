package vinoth.dsa.string;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string in the array as the reference
        String prefix = strs[0];

        // Compare this prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Update the prefix by comparing it with the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix by one character until a match is found
                prefix = prefix.substring(0, prefix.length() - 1);
                // If the prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interspecies", "interstellar", "interstate"};

        System.out.println(longestCommonPrefix(strs1));  // Output: "fl"
        System.out.println(longestCommonPrefix(strs2));  // Output: ""
        System.out.println(longestCommonPrefix(strs3));  // Output: "inters"
    }
}
