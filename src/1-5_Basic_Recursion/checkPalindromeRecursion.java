public class checkPalindromeRecursion {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        return helper(0,str.length()-1,str);
    }
    private static boolean helper(int i,int j,String str){
        if(i>=j){
            return true;
        }
        if(str.charAt(i)==str.charAt(j)){
            return helper(i+1,j-1,str);
        }
        return false;
    }
}