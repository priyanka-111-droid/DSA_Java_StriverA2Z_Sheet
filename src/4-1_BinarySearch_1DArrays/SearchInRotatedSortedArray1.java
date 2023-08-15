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