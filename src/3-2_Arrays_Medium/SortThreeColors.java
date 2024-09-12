/*
- Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
- dutch national flag algorithm
    low pointer - where to place 0 - move to left
    high pointer - where to place 2 - move to right
    mid pointer - traverse array,1 automaticaaly placed in middle
*/


public class SortThreeColors{

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(nums[mid]== 0) {
                //swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }
            else{
                //swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}