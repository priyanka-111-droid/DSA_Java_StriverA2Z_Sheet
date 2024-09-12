/*
Given an integer array nums, find the
subarray with the largest sum, and return its sum.

- kadane algorithm(optimized)
 */
public class MaximumSubarraySum {

    public static long maxSubarraySum(int[] arr, int n) {
        public int maxSubArray(int[] nums) {
            int maxi = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>maxi){
                    maxi = sum;
                }

                if(sum<0){
                    sum=0;
                }
            }
            return maxi;
        }
    }
}