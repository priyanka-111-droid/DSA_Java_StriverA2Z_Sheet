/*
 calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.
 - complex way: fast exp,sum
 - simple way: cubed ,sum
*/
public class sumOfFirstNCubes{
    long sumOfSeriesComplex(long n) {//O(nlogn),O(n)
        if(n<1){
            return 0;
        }
        return fastExponentiation(n,3)+sumOfSeriesComplex(n-1);
    }
    long sumOfSeriesSimple(long n){
        if(n<1){
            return 0;
        }
        return n*n*n +sumOfSeriesSimple(n-1);
    }
    long fastExponentiation(long b,long n){
        if(n==0){
            return 1;
        }else if(n%2==0){
            return (long)(Math.pow(fastExponentiation(b,n/2),2));
        }else{
            return b* fastExponentiation(b,n-1);
        }
    }
}