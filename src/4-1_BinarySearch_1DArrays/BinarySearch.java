public class BinarySearch {
    public static int search(int []nums, int target) {
        //sorted array, algo with TC O(logn) so binary search
        int n = nums.length;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==nums[mid]){
                return mid;
            }else if(target>nums[mid]){
                //target located in upper half
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}