/*
Given two sorted arrays of size n and m respectively, find their union.
The Union of two arrays can be defined as the common and distinct elements in the two arrays.
Return the elements in sorted order.

- using Treeset(set that stores elements in sorted way)
- 2 pointer
 */
import java.util.*;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnionByTreeset(int arr1[], int arr2[], int n, int m) //O(nlogn)+O(mlogm),O(m+n)
    {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        //store elements of TreeSet in List
        ArrayList<Integer> lst = new ArrayList<>(set);
        return lst;
    }

    public static ArrayList<Integer> findUnionTwoPointer(int arr1[], int arr2[], int n, int m)//O(m+n),O(m+n)
    {
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j])
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }

}