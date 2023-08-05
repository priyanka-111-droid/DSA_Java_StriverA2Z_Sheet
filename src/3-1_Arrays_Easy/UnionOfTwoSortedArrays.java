import java.util.*;
public class UnionOfTwoSortedArrays {
    //Method - use TreeSet
    public static List< Integer > sortedArray(int []a, int []b) {
        //use TreeSet and not HashSet as elements sorted in TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        //store elements of TreeSet in List
        List<Integer> lst = new ArrayList<>(set);
        return lst;
    }
}