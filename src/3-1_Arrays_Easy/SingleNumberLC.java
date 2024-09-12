/*
Given a non-empty array of integers nums, every element appears twice except for one.
 Find that single one.

 - property of xor.
 - xor of 2 same numbers is 0 and xor of number and 0 is that number itself.
 */
public class SingleNumberLC{
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor;
    }
}