/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

- hashmap(optimized)
 */
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target-nums[i];
            if(hmap.containsKey(complement)){
                return new int[]{hmap.get(complement),i};
            }
            //if complement not in hashmap,add current number and index to hashmap
            hmap.put(nums[i],i);
        }
        //default value to return if no match
        return new int[]{-1,-1};
    }
}