/*
Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.
 */
public class MaximumNestingDepthOfParenthesis {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maximumDepth = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                currentDepth++;
                maximumDepth = Math.max(maximumDepth,currentDepth);

            }else if(ch==')'){
                currentDepth--;
            }
        }
        return maximumDepth;
    }
}
