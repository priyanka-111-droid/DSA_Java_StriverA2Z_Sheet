import java.util.* ;
import java.io.*;

public class MaximumSubarraySum {
    //kadane algorithm
    public static long maxSubarraySum(int[] arr, int n) {
        long maxEndingHere = arr[0];
        long maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], arr[i] + maxEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        // If all numbers are negative, return the maximum element as the maximum subarray sum
        if(maxSoFar<0){
            maxSoFar=0;
        }
        return maxSoFar;
    }
}