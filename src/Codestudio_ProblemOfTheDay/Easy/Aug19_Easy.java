package Codestudio_ProblemOfTheDay.Easy;

import java.util.Arrays;
public class Aug19_Easy {

    static int minDiff(int n, int[] arr) {
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            //    int diff = Math.abs(arr[i]-arr[i-1]);
            mini = Math.min(mini,Math.abs(arr[i]-arr[i-1]));
        }
        return mini;
    }
}