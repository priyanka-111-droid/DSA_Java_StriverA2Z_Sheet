import java.util.ArrayList;
public class PeakElement {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();
        int low=1;
        int high = n-2;
        for(int i = low;i<=high;i++){
            if(arr.get(i-1)< arr.get(i) && arr.get(i+1)<arr.get(i)){
                return i;
            }
        }
        if (arr.get(0)>arr.get(1)) return 0;
        if (arr.get(n-1)>arr.get(n-2)) return n-1;

        return -1;
    }
};