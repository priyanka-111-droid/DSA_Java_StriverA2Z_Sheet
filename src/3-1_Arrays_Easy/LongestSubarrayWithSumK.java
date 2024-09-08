import java.util.* ;
import java.io.*;
public class LongestSubarrayWithSumK {
    //no sliding window as negative test cases also there
    public static int getLongestSubarray(int []nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum+=nums[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}