import java.util.Arrays;
public class countFrequency {
    public static int[] countFrequency(int n, int x, int []nums){
        int hash[] = new int[n];
        int i = 0;
        while (i<n)
        {
            if (nums[i] >= 1 && nums[i] <= n) {
                hash[nums[i] - 1]++;
            }
            i++;
        }
        return hash;
    }
}