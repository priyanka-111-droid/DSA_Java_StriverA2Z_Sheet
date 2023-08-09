public class CountSubarraysWithGivenSumK {
    //sliding window concept
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int windowStart=0;
        int windowSum = 0;
        int count=0;
        for(int windowEnd=0;windowEnd<arr.length;windowEnd++){
            windowSum+=arr[windowEnd];
            while(windowSum>s){
                windowSum-=arr[windowStart];
                windowStart++;
            }
            if(windowSum==s){
                count++;
            }
        }
        return count;
    }
}