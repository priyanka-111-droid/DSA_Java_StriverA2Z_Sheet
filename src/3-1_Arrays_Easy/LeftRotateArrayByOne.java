
public class LeftRotateArrayByOne {

    static int[] rotateArray(int[] arr, int n) {
        int start = arr[0];
        for(int i=1;i<n;i++){
            //place element at arr[i] into i-1 position
            arr[i-1] = arr[i];
        }
        //place starting element at end
        arr[n-1] = start;
        return arr;
    }
}