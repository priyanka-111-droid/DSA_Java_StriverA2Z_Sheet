/*
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

- prefix array and hashmap(optimized)
 */
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySumOptimized(int[] nums, int k) {//O(N),O(N)
        int running = 0;
        int total = 0;

        //Instead of generating the entire prefix array, we iterate through nums while keeping a running sum and track how many times we've seen each prefix sum with a frequency hash.
        Map<Integer, Integer> sumFrequency = new HashMap<>();
        sumFrequency.put(0, 1);//handles the edge case when targetSum is 0, since this sum does in a sense exist - following the above logic, the number of subarrays with sum 0 is 1, as this is the empty subarray, no elements.

        for (int i = 0; i < nums.length; i++) {
            running += nums[i];
            int targetSum = running - k;

            if (sumFrequency.containsKey(targetSum)) {
                total += sumFrequency.get(targetSum);
            }

            sumFrequency.put(running, sumFrequency.getOrDefault(running, 0) + 1);
        }

        return total;
    }
    public int subarraySumBruteForce(int[] nums, int k) {//O(N^2),O(1)
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
