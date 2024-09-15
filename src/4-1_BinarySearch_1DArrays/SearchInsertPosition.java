//given sorted array and target element to find 'm'.
//find index of 'm'
//if value absent, find index where it will be inserted.
public class SearchInsertPosition {
    //sorted array so we can try binary search
    public int searchInsert(int[] nums, int target) {
        int low = 0,high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}