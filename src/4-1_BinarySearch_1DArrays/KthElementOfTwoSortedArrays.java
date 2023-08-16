import java.util.ArrayList;

public class KthElementOfTwoSortedArrays {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        int i = 0, j = 0, p = 0;
        ArrayList<Integer> arr3 = new ArrayList<>(); // new combined array

        // Merge the two sorted arrays into arr3
        while (i < n && j < m) {
            if (arr1.get(i) <= arr2.get(j)) {
                p++;
                if(p==k)
                    return arr1.get(i);
                i++;
            } else {
                p++;
                if(p==k)
                    return arr2.get(j);
                j++;
            }
        }

        // Copy the remaining elements from arr1, if any
        while (i < n) {
            p++;
            if(p==k)
                return arr1.get(i);
            i++;
        }

        // Copy the remaining elements from arr2, if any
        while (j < m) {
            p++;
            if(p==k)
                return arr2.get(j);
            j++;
        }
        return 0;
    }
    /*
    brute force using merge sort - gives TLE

    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        int i = 0, j = 0, p = 0;
        ArrayList<Integer> arr3 = new ArrayList<>(); // new combined array

        // Merge the two sorted arrays into arr3
        while (i < n && j < m) {
            if (arr1.get(i) <= arr2.get(j)) {
                arr3.add(arr1.get(i));
                i++;
            } else {
                arr3.add(arr2.get(j));
                j++;
            }
            p++;
        }

        // Copy the remaining elements from arr1, if any
        while (i < n) {
            arr3.add(arr1.get(i));
            i++;
            p++;
        }

        // Copy the remaining elements from arr2, if any
        while (j < m) {
            arr3.add(arr2.get(j));
            j++;
            p++;
        }

        return arr3.get(k - 1);
    }
    */
}
