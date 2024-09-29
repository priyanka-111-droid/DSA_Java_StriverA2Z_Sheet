/*
Given an integer n, find the square root of n. If n is not a perfect square, then return the floor value.

 //optimal  - binary search
 //low = 1 (smallest positive integer) since the square root is generally defined for positive numbers.
 */

public class SqrtN {

    public static int sqrtNBruteForce(long N) {
        int ans = 0;
        for (long i = 1; i <= N; i++) {
            long val = i * i;
            if (val <= (long) N) {
                ans = (int) i;
            } else {
                break;
            }
        }
        return ans;
    }
    public static long floorSqrtOptimal(long n) {
        long low=1;
        long high = n;
        while(low<=high){
            long mid = (low+high)/2;
            long val = mid*mid;
            if(val<=n){
                low= mid+1;
            }else{
                high = mid-1;
            }
        }
        return (int)high;
    }
}