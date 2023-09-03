//reverse word order in string and return string

public class ReverseWordsInString
{
    public static String reverseString(String str)
    {
        String[] words = str.split(" ");
        StringBuilder sb= new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            // Add a space unless it's the last word
            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}