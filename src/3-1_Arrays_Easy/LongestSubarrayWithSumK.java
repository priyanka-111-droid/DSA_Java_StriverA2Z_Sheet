import java.util.* ;
import java.io.*;
public class LongestSubarrayWithSumK {
    //no sliding window as negative test cases also there
    public static int lenOfLongSubarr(int A[], int N, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < N; i++){
            sum+=A[i];
            if(sum == K){
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - K;
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