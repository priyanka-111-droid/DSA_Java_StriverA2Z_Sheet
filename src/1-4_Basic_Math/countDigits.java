public class countDigits {
    public static int countDigits(int n){
        // Write your code here.
        int temp=n;
        int k=0;
        while(n>0){
            int r=n%10;
            if(r!=0){
                if(temp%r==0){
                    k++;
                }
            }
            n/=10;
        }
        return k;
    }
}