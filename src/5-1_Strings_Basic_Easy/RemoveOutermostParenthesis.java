//return max nesting depth of parenthesis in string.
public class RemoveOutermostParenthesis {
    public static int maxDepth(String s) {
        int maxDepth = 0; // Variable to store the maximum depth
        int currentDepth = 0; // Variable to keep track of the current depth

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                currentDepth++; // Increase depth when an opening parenthesis is encountered
                maxDepth = Math.max(maxDepth, currentDepth); // Update maxDepth if needed
            } else if (ch == ')') {
                currentDepth--; // Decrease depth when a closing parenthesis is encountered
            }
        }
        return maxDepth;
    }
}