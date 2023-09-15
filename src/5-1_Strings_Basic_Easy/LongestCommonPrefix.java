import java.util.Arrays;
public class LongestCommonPrefix {
    public static String commonPrefix(String []str,int n){
        // Sort the array of strings in lexicographical (alphabetical) order


        Arrays.sort(str);



// Get the first (smallest) string and the last (largest) string in the sorted array


        String s1 = str[0];
        String s2 = str[str.length - 1];



// Initialize a variable to keep track of the common prefix length


        int i = 0;

// Iterate through the characters of s1 and s2 while comparing them
        while (i < s1.length() && i < s2.length()) {

// If the characters at the current position are the same, continue to the next character
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
// If the characters are different and it's the first character position (i.e., i == 0),
// return "-1" to indicate no common prefix.
                if (i == 0) {
                    return "-1";
                } else {
                    // If the characters are different at some position other than the first,
                    // break the loop to stop comparing further characters.
                    break;
                }
            }
        }

// Return the common prefix of s1 and s2, which is the substring from the beginning up to position i.
        return s1.substring(0, i);
    }
}