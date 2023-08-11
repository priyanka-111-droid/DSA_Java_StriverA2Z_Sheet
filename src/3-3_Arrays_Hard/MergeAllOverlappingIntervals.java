import java.util.*;

public class MergeAllOverlappingIntervals {
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        int n =arr.length;
        List< List<Integer> > res = new ArrayList<>();

        // Sort intervals based on the start times
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int i = 0;
        while (i < n) {
            int start = arr[i][0];
            int end = arr[i][1];

            //we update the end time
            while (i < n - 1 && end >= arr[i + 1][0]) {
                end = Math.max(end, arr[i + 1][1]);
                i++;
            }

            //add new merged interval in res
            List<Integer> newInterval = new ArrayList<>();
            newInterval.add(start);
            newInterval.add(end);
            res.add(newInterval);

            i++;
        }
        return res;
    }
    /**
     * WRONG CODE BELOW!!!!
     * public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
     *         int n = arr.length;
     *         List<List<Integer>> res = new ArrayList<>();
     *
     *         for (int i = 0; i < n - 1; i++) {
     *             List<Integer> newInterval = new ArrayList<>();
     *             if (arr[i][0] <= arr[i + 1][0]) {
     *                 if (arr[i + 1][0] <= arr[i][1]) {
     *                     newInterval.add(arr[i][0]);
     *                     newInterval.add(arr[i + 1][1]);
     *                     res.add(newInterval);
     *                 }
     *             }
     *         }
     *         return res;
     *     }
     *
     *     Code is wrong as:
     *     - Sorting:
     *     haven't sorted the intervals based on their start times,
     *     Without sorting, you cannot properly detect which intervals should be merged.
     *     - Loop interval:
     *     loop iterates through the array up to n - 1,
     *     which means the last interval won't be considered for merging.
     *     - Merging Logic:
     *     logic inside the loop for merging intervals isn't complete.
     *     We are checking if the start time of the next interval is within the range
     *     of the current interval,but you need to also check the end times and decide
     *     how to merge them.
     *     - Incrementing i:
     *     We are incrementing i within the inner loop, which can cause
     *     us to skip intervals that might still need to be merged.
     */
}