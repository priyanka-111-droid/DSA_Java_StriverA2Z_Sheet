public class LowerBound{
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {//O(logN),O(1)
        int low = 0, high = n - 1;
        int floor_index=-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid]== x) {
                return mid;
            }else if(arr[mid]<x){
                floor_index=mid; //potential answer,move right
                low=mid+1;
            } else {
                high=mid-1; //move left
            }
        }
        return floor_index;
    }
}
