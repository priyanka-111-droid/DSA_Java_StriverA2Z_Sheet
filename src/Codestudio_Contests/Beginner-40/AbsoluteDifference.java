import java.util.*;

//count number of pairs in array with maximum absolute difference
public class AbsoluteDifference {
    public static long countPairs(int n,int[] a) {

        int f = 1;
        int l = 1;
        long ans = 2;
        Arrays.sort(a);
        //ans already has 2 as 1 pair is (first ele,last ele) and next pair is (last ele,first ele)


        //all elements same in array
        if (a[0] == a[n - 1])
            return n * (n - 1);

        //we will have one pair that is abs diff(first ele,last ele)
        for (int i = 1; i < n - 1; i++) {
            //search for element equal to first element
            if (a[i] == a[0]) {
                f++;
                ans += 2 * l; //make it pair by combining it with last ele
            } else if (a[i] == a[n - 1]) {
                //search for ele equal to last element
                l++;
                ans += 2 * f; //make it pair by combining it with first ele
            }
        }
        return ans;
    }
}