import java.util.ArrayList;
import java.util.Collections;

public class SortTwoOneZero{
    //dutch national flag algorithm
    /*
    low pointer - where to place 0 - move to left
    high pointer - where to place 2 - move to right
    mid pointer - traverse array,1 automaticaaly placed in middle
    */
    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if (arr.get(mid)== 0) {
                //swap arr(low) and arr(mid)
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }else if(arr.get(mid)==1){
                mid++;
            }
            else{
                //swap arr(mid) and arr(high)
                int temp = arr.get(mid);
                arr.set(mid,arr.get(high));
                arr.set(high,temp);

                high--;
            }
        }
    }
}