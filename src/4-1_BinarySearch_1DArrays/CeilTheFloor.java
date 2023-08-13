import java.util.* ;
import java.io.*;
public class CeilTheFloor {
    public static int getCeil(int n,int x,int[] arr){
        int low = 0;
        int high = n-1;
        int ceiling=-1;
        while(low<=high){
            int mid = low + (high - low)/2;

            //if element present in array,it will be floor and ceil
            if(arr[mid]==x){
                return arr[mid];
            }
            //we are looking for element LARGER than x
            else if(arr[mid]>x){
                high=mid-1;
                ceiling=arr[mid];
            }else{
                low=mid+1;
            }
        }
        return ceiling;
    }
    public static int getFloor(int n,int x,int[] arr){
        int low = 0;
        int high = n-1;
        int floor=-1;
        while(low<=high){
            int mid = low + (high - low)/2;

            //if element present in array,it will be floor and ceil
            if(arr[mid]==x){
                return arr[mid];
            }
            //we are looking for element SMALLER than x
            else if(arr[mid]<x){
                low=mid+1;
                floor=arr[mid];
            }else{
                high=mid-1;
            }
        }
        return floor;
    }
    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int ceil = getCeil(n,x,arr);
        int floor = getFloor(n,x,arr);
        System.out.print(floor+" ");
        return ceil;
    }
}