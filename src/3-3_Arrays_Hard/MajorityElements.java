/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */
import java.util.*;
public class MajorityElements{
    public static List< Integer > majorityElement(int []v) {
        // Number of elements in the array
        int n = v.length;

        List< Integer > ans = new ArrayList<>();
        List< Integer > res = new ArrayList<>();
        // Int ans[] is the array storing all elements
        // having a frequency greater than floor(n / 3),

        // int res[] is the array storing unique elements
        // of array 'ans'.

        for(int i = 0; i < n; ++i) {
            int curr = v[i], cnt = 0;
            // curr is the current element
            // cnt stores the count of
            // this element in the array
            for(int j = 0; j < n; ++j) {
                if(curr == v[j])
                    ++cnt;
            }
            if(cnt > n / 3) {
                ans.add(curr);
            }
        }

        for(int i = 0; i < ans.size(); ++i) {
            if(!res.contains(ans.get(i))) {
                res.add(ans.get(i));
            }
        }
        Collections.sort(res);
        return res;
    }
}