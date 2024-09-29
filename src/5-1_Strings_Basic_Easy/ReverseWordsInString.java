/*
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */

public class ReverseWordsInString
{
    public static String reverseWords(String str)
    {
        String[] words = str.trim().split("\\s+");//converts multiple spaces between words to 1 single space.
        StringBuilder sb= new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            // Add a space unless it's the last word
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}