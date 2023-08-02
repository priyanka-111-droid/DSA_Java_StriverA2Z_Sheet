public class checkPalindrome {
    public static boolean palindromeNumber(int n){
        int temp=n,rev=0;
        while(n!=0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev==temp;
    }
}