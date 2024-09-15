/*
There is an integer array nums sorted in ascending order (with distinct values).nums is possibly rotated at an unknown pivot index.
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

 */
import java.util.ArrayList;
public class SearchInRotatedSortedArray1 {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==k){
                return mid;
            }else if(arr.get(high)>arr.get(mid)){
                //right part sorted
                if(arr.get(mid)<=k && k<=arr.get(high)){
                    low=mid+1;//eliminate left half
                }else{
                    high=mid-1;//eliminate right half
                }
            }else{
                //left part sorted
                if(arr.get(low) <= k && k <= arr.get(mid)){
                    high=mid-1;//target in this half.eliminate right half
                }else{
                    low=mid+1;//eliminate left half
                }
            }
        }
        return -1;
    }
}