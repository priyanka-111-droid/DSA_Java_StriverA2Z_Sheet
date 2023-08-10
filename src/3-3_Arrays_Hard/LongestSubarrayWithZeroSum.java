import java.util.HashMap;

public class LongestSubarrayWithZeroSum {
    //sliding window did not work as sum of a subarray becomes zero multiple times
    // in the array, and the longest subarray with a zero sum is not the
    // first one you encounter.
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        sumIndexMap.put(0, -1);  // Initialize to handle the case when sum becomes zero

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sumIndexMap.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - sumIndexMap.get(sum));
            } else {
                sumIndexMap.put(sum, i);
            }
        }

        return maxLength;
    }
}