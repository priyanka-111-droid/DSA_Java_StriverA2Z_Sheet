public class MaxConsecutiveOnes{
    //sliding window
    public static int traffic(int n,int m,int[] vehicle){
        int zeroCount=0;
        int start = 0;
        int i =0;
        int maximumTraffic = 0;
        while(i<n){
            if(vehicle[i]==0){
                zeroCount++;
            }
            while(zeroCount>m){
                if(vehicle[start]==0){
                    zeroCount--;
                }
                start++; //have count in range of m only.
            }
            i++;
            maximumTraffic = Math.max(maximumTraffic,i-start);//max between max and current place
        }
        return maximumTraffic;
    }
}