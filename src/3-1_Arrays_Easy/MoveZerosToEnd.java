import java.util.ArrayList;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

- bruteforce
- 2 pointer(in place solution) - more optimal
 */
public class MoveZerosToEnd {
    //brute force method
    public static int[] moveZerosBruteForce(int n, int []a) {
        ArrayList<Integer> rest = new ArrayList<Integer>();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                rest.add(a[i]);
            }
        }
        int restLength = rest.size();
        for(int i=0;i<restLength;i++){
            res[i] = rest.get(i);
        }
        for(int i=restLength;i<n;i++){
            res[i] = 0;
        }
        return res;
    }

    //optimal method  - 2 pointer
    public void moveZeroesOptimal(int[] arr) {
        int n = arr.length;
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
            return;
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
    }

}