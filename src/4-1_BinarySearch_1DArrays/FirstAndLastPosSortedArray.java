/*
Find First and Last Position of Element in Sorted Array.
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].

- brute force-> 2 loops ,one from i=0 to n and another from i=n-1 to 0
- binary search+2 ptr
 */
import java.util.*;

public class FirstAndLastPosSortedArray{

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        // Find the first occurrence
        while (low<=high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                high = mid - 1; // Move left to potentially find earlier occurrences
            } else if (nums[mid] < target) {
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
            if (nums[mid] == target) {
                result[1] = mid;
                low = mid + 1; // Move right to potentially find later occurrences
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
    //WRONG APPROACH!!
    //convert array to string using toString() and then do indexOf and lastIndexOf()->
    //Here, we get a string representatithis string representation,
    // it tries to find the index of the on of the array, not the actual array of integers.
    //    // When you use indexOf((char) k) on character k within the string,
    // which doesn't represent the integer values anymore.
}