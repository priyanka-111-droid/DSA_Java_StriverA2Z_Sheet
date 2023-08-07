public class LongestSubarrayOfSumK{
    //sliding window
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int maxLen = 0;
        int windowStart = 0;
        long windowSum = 0;
        //we use window concept to find longest subarray

        for (int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            windowSum += a[windowEnd];

            //keep moving start to right as long as windowSum>k
            while (windowSum > k) {
                windowSum -= a[windowStart];
                windowStart++;
            }

            if (windowSum == k) {
                maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
            }
        }

        return maxLen;
    }
}