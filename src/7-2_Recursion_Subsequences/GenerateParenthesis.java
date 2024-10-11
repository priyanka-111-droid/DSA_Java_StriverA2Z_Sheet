import java.util.* ;
import java.io.*;
class GenerateParenthesis{
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper("",0,0,n,result);
        return result;
    }
    private static void generateParenthesisHelper(
            String current,int open,int close,int max,List<String> result
    ){
        //base case where we return to parent function
        if(current.length()==2*max){
            result.add(current);
            return;
        }

        //when to add opening (
        if(open<max){
            generateParenthesisHelper(current + "(", open + 1, close, max, result);
        }
        // add closing ) when there are unmatched opening (
        if (close < open) {
            generateParenthesisHelper(current + ")", open, close + 1, max, result);
        }
    }
}