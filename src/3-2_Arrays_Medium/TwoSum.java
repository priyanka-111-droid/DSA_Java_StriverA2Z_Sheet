/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

- 2 loops(brute force)
- hashmap(optimized)
 */
import java.util.HashMap;

public class TwoSum {

    public int[] twoSumOptimized(int[] nums, int target) {//O(N),O(N)
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
    public int[] twoSumBruteForce(int[] nums,int target){//TC: O(N^2),SC: O(1)
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        //default value to return if no match
        return new int[]{-1,-1};
    }
}