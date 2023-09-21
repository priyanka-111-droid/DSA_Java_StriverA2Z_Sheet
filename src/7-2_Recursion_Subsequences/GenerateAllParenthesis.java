import java.util.* ;
import java.io.*;
public class GenerateAllParenthesis {
    public static ArrayList<String> validParenthesis(int n){
        ArrayList<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }
    private static void generate(List<String> result, String current, int open, int close, int n) {
        // Base case: If the length of the current string is 2*N, add it to the result.
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add an open parenthesis if the count of open parentheses is less than N.
        if (open < n) {
            generate(result, current + "(", open + 1, close, n);
        }

        // Add a close parenthesis if it makes the string well-formed.
        if (close < open) {
            generate(result, current + ")", open, close + 1, n);
        }
    }
}