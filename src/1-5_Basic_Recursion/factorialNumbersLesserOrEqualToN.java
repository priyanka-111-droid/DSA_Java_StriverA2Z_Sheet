/*
return all factorial nos <=N;
eg n=6, o/p = 1,2,6.
- loop 1 to n, check if i is factorial
- loop 1 to n, do i++,calculate product(factorial) in same loop.
 */
import java.util.ArrayList;

public class factorialNumbersLesserOrEqualToN {
    static boolean isFactorial(long n){
        return isFactorialHelper(n,1,1);
    }
    static boolean isFactorialHelper(long n,long i,long p){
        if(i>n){
            return false;
        }
        if(p==n){
            return true;
        }
        i+=1;
        p = p*i;
        return isFactorialHelper(n,i,p);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> aList = new ArrayList<>();
        long p = 1;
        long i = 1;

        while(p<=n){
            aList.add(p);
            i+=1;
            p = p*i;
        }
        return aList;
    }
}