import java.util.*;

public class FirstAndLastPosSortedArray{
    //brute force-> 2 loops ,one from i=0 to n and another from i=n-1 to 0
    //2 pointer approach->
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] result = new int[]{-1, -1};

        int low = 0;
        int high = n - 1;

        // Find the first occurrence
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                result[0] = mid;
                high = mid - 1; // Move left to potentially find earlier occurrences
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find the last occurrence
        low = 0;
        high = n - 1;
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == k) {
                result[1] = mid;
                low = mid + 1; // Move right to potentially find later occurrences
            } else if (arr.get(mid) < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
    //WRONG APPROACH!!
    //convert array to string using toString() and then do indexOf and lastIndexOf()->
    //Here, we get a string representation of the array, not the actual array of integers.
    // When you use indexOf((char) k) on this string representation,
    // it tries to find the index of the character k within the string,
    // which doesn't represent the integer values anymore.
}