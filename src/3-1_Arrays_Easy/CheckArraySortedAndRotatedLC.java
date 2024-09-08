/*
Given an array nums, return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.

- One important property of a rotated non-decreasing array is that it will have at most one point where the next number is less than the current number, which happens at the rotation point.
In a purely sorted array, this does not happen at all.
 */
public class CheckArraySortedAndRotatedLC {
    public boolean check(int[] nums) {//O(N),O(1)
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                // Check if the current element is greater than the next element
                // The next element of the last item is the first item, hence the modulo operation.
                count++;
            }
        }
        return count<=1;
    }
}