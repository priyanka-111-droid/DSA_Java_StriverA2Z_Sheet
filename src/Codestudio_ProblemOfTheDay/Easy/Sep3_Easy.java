import java.util.HashMap;
import java.util.ArrayList;
/*
Count Distinct Element in Every K Size Window:
Input: arr[] = {1, 2, 1, 3, 4, 2, 3}, K = 4
Output: 3 4 4 3
Explanation: First window is {1, 2, 1, 3}, count of distinct numbers is 3
                      Second window is {2, 1, 3, 4} count of distinct numbers is 4
                      Third window is {1, 3, 4, 2} count of distinct numbers is 4
                      Fourth window is {3, 4, 2, 3} count of distinct numbers is 3
 */
public class Sep3_Easy{
    static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k){
        //convert arraylist input to array
        int N = arr.size();
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = arr.get(i);
        }
        //hashmap
        HashMap<Integer,Integer> hmp = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        //count of all values in first window of size k
        for(int i=0;i<K;i++){
            hmp.put(a[i],hmp.getOrDefault(a[i],0)+1);
        }

        //add count of first window
        result.add(hmp.size());

        for(int i=k;i<N;i++){
            // Remove first element of previous window
            // If there was only one occurrence
            if (hmp.get(a[i - k]) == 1) {
                hmp.remove(a[i - k]);
            }
            else // reduce count of the removed element
                hmp.put(a[i - k], hmp.get(a[i - k]) - 1);

            // Add new element of current window
            // If this element appears first time,
            // set its count as 1,
            hmp.put(a[i], hmp.getOrDefault(a[i], 0) + 1);

            // Print count of current window
            result.add(hmp.size());

        }
        return result;
    }
}