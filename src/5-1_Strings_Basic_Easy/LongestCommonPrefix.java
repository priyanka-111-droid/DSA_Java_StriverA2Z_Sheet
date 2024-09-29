/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

- vertical scanning:O(S) where S is sum of all chars in string, O(1)
 */
import java.util.Arrays;
public class LongestCommonPrefix {
    public String longestCommonPrefixVerticalScanning(String[] strs) {
        // Initialize prefix with the first string in the array.
        String prefix = strs[0];

        for(int i = 1;i<strs.length;i++){
            // Keep checking if the current string starts with the prefix.
            // If not, shorten the prefix by one character from the end.
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                // If prefix becomes empty, there is no common prefix,return "".
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}