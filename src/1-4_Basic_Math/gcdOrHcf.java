public class gcdOrHcf {
    public static int calcGCD(int n, int m){
        // Write your code here.
        if(n%m==0){
            return m;
        }
        return calcGCD(m,n%m);
    }
}