/*
Given an array arr[], with 0-based indexing,
select any two indexes, i and j such that i < j.
From the subarray arr[i...j], select the smallest and second smallest numbers and add them,
you will get the score for that subarray.
Return the maximum possible score across all the subarrays of array arr[].

- instead of considering subarray and finding smallest and second smallest, consider pairs of elements.
- eg.Subarray[5,3,1] has pair[1,3] where 1 is smallest and 3 is second smallest.So smallest and second smallest are always contiguous.
- hence we can consider score as arr[i] and arr[i+1]
 */
import java.util.List;

public class MaximumScoreFromSubarrayMinimumsGFG {
    // Function to find pair with maximum sum
    int sum = 0;
    public int pairWithMaxSum(List<Integer> arr) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.size()-1;i++){
            sum = 0;
            sum=arr.get(i)+arr.get(i+1);
            maxi = Math.max(maxi,sum);

        }
        return maxi;
    }
}