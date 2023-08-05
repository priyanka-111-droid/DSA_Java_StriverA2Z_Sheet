import java.util.*;
public class MoveZerosToEnd {
    //optimal method  - 2 pointer
    public static int[] moveZeros(int n, int []arr) {
        int j=-1;
        //place j at first 0
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        //if no zero element,
        if(j==-1){
            return arr;
        }
        //find first non zero element starting from arr[1]
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                //swap with zero
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }
        }
        return arr;
    }
    //brute force method
//    public static int[] moveZeros(int n, int []a) {
//        List<Integer> rest = new ArrayList<Integer>();
//        int[] res = new int[n];
//        for(int i=0;i<n;i++){
//            if(a[i]!=0){
//                rest.add(a[i]);
//            }
//        }
//        int restLength = rest.size();
//        for(int i=0;i<restLength;i++){
//            res[i] = rest.get(i);
//        }
//        for(int i=restLength;i<n;i++){
//            res[i] = 0;
//        }
//        return res;
//    }
}