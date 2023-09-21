import java.util.*;
public class PrintSubsequences {
    public static List<String> generateSubsequences(String s) {
        List<String> res = new ArrayList<>();//result
        helper(res,"",s,0);
        return res;
    }
    private static void helper(List<String> res,String current_string,String s,int index){
        //index tracks current character in string
        //current_string is subsequence being built
        if(index==s.length()){
            res.add(current_string);
            return;
        }
        // Include the current character at index
        helper(res,current_string+s.charAt(index),s,index+1);

        //exlude current char at index
        helper(res,current_string,s,index+1);
    }
}