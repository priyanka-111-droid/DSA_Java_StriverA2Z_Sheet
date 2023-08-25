public class MinDaysTomakeMBouquets{

    //determine the least number of days needed to
    //make a specific number of bouquets
    //while adhering to certain constraints.


    public static boolean possible(int[] arr, int day, int m, int k) {
        // checks whether it's possible to create the desired number of bouquets on a given day,

        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }


    public static int roseGarden(int[] arr, int k, int m) {
        long val = (long) m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        // Find maximum and minimum:
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        for (int i = mini; i <= maxi; i++) {
            if (possible(arr, i, m, k)) //if possible to make bouquet in i days,
                return i; //return i
        }
        return -1;
    }
}