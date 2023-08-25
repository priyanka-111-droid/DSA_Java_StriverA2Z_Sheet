public class KokoEatingBananas {

    public static int findMax(int[] v){
        //return maximum of array
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++){
            maxi = Math.max(maxi,v[i]);
        }
        return maxi;
    }
    public static int getTotalHours(int[] v,int t){
        // the function returns the total hours required to eat all the bananas in the given piles at the specified hourly rate.
        int totalH = 0;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            //time required to eat the bananas in the current pile is calculated and added to the totalH variable.
            totalH += Math.ceil((double)(v[i]) / (double)(t));//use double for accuracy in division
            //This function rounds the calculated time to the smallest integer greater than or equal to the calculated value. Since Koko cannot eat a fraction of an hour, the time needs to be rounded up.
        }
        return totalH;
    }
    public static int minimumRateToEatBananas(int []v, int h) {
        /*
        brute force - gives TLE
        //method iterates through possible hourly rates and
        //finds the first rate that allows Koko to finish eating within the given time.

        int maxi = findMax(v);
        for(int i=1;i<=maxi;i++){
            int totalHours = getTotalHours(v,i);
            if(totalHours<=h){
                return i;
            }
        }
        //dummy return
        return maxi;
        */

        /*
        Binary search method:
        */
        int low = 1, high = findMax(v);
        //If the calculated total hours are less than or equal to h,
        // it means Koko could finish eating within that time,
        // so it narrows the search to the left side by updating high(since we need MINIMUM hourly rate
        // If the calculated total hours are greater than h, it means
        // Koko needs more time, so it narrows the search to the right side
        // by updating low
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = getTotalHours(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
