public class Pow{
    public static double myPow(double x, int n) {
        if(n==0){
            return 1;//base case
        }
        if(n>0){
            return x*myPow(x,n-1);
        }
        else if(n<0){
            return (1/x)*myPow(x, n+1);
        }
        return 0;//dummy case
    }
}