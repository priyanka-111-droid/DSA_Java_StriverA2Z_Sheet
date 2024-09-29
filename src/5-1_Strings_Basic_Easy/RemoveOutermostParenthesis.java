/*
Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 */
public class RemoveOutermostParenthesis {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;//tracks number of outermost patenthesis

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch); // Add '(' if not the outermost
                }
                balance++;
            } else if (ch == ')') {
                balance--;
                if (balance > 0) {
                    result.append(ch); // Add ')' if not the outermost
                }
            }
        }

        return result.toString();
    }
}