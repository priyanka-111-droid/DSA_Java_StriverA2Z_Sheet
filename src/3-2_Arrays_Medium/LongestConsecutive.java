import java.util.*;
public class LongestConsecutive {

    //brute force - sorting and then compare:
//    public static int longestSuccessiveElements(int []a) {
//        int n = a.length;
//        if (n == 0) return 0;
//
//        //sort the array:
//        Arrays.sort(a);
//        int lastSmaller = Integer.MIN_VALUE;
//        int cnt = 0;
//        int longest = 1;
//
//        //find longest sequence:
//        for (int i = 0; i < n; i++) {
//            if (a[i] - 1 == lastSmaller) {
//                //a[i] is the next element of the
//                //current sequence.
//                cnt += 1;
//                lastSmaller = a[i];
//            } else if (a[i] != lastSmaller) {
//                cnt = 1;
//                lastSmaller = a[i];
//            }
//            longest = Math.max(longest, cnt);
//        }
//        return longest;
//    }
    //optimal - HashSet
    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 0;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}