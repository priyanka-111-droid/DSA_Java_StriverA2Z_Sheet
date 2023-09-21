/*
given N,generate binary strings of length N,
no 2 consecutive 1's allowed.
 */
import java.util.*;
public class BinaryStrings {
    public static List< String > generateString(int N) {
        List<String> res = new ArrayList<>();
        helper(N, "", res);
        return res;
    }
    private static void helper(int N,String current_str,List<String> res){
        if (current_str.length() == N) {
            res.add(current_str);
            return;
        }

        // Append '0' without restriction
        helper(N, current_str + '0', res);

        // Append '1' only if the last character is not '1'
        if (current_str.isEmpty() || current_str.charAt(current_str.length() - 1) != '1') {
            helper(N, current_str + '1', res);
        }
    }
}
