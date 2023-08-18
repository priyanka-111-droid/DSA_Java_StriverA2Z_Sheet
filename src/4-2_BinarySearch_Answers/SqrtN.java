import java.util.* ;
import java.io.*;

public class SqrtN {

    public static int sqrtN(long N) {
		/*
		brute force
		*/
        // int ans = 0;
        // for (long i = 1; i <= N; i++) {
        //     long val = i * i;
        //     if (val <= (long) N) {
        //         ans = (int) i;
        //     } else {
        //         break;
        //     }
        // }
        // return ans;


		/*
		sqrt method
		*/
        // return (int)Math.sqrt(N);


        //optimal  - binary search
        long low=1,high=N;
        while(low<=high){
            long mid = (low+high)/2;
            long val = mid*mid;
            //we are not returning mid here as we want maximum number that is the sqrt
            if(val<=N){
                //remove left half,search for a larger number(in right half)
                low = mid+1;
            }else if(val>N){
                high = mid-1;
            }
        }
        return (int)high;
    }
}