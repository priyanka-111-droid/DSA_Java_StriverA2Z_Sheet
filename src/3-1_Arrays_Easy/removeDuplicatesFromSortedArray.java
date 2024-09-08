//Method 1 - use HashMap
import java.util.*;
public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            if (freq.containsKey(arr.get(i))) {
                freq.put(arr.get(i), freq.get(arr.get(i)) + 1);
            }
            else {
                freq.put(arr.get(i), 1);
            }
        }
        for (int element : freq.keySet()) {
            res.add(element);
        }
        return res.size();
    }
}
//Method 2 - Hashset
//public static int removeDuplicates(ArrayList<Integer> arr,int n) {
//    HashSet<Integer> set = new HashSet<>();
//
//    for(int i = 0 ; i < n ; i++){
//
//        set.add(arr.get(i));
//
//    }
//    return set.size();
//}
