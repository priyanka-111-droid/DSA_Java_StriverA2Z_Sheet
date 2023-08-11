//given sorted array and target element to find 'm'.
//find index of 'm'
//if value absent, find index where it will be inserted.
public class SearchInsertPosition {
    //sorted array so we can try binary search
    public static int searchInsert(int [] arr, int m){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==m){
                return mid;
            }else if(m>arr[mid]){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}