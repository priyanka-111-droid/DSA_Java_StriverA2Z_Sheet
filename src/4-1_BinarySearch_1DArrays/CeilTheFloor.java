/*
Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].
Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].
Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.
 */
import java.util.* ;
import java.io.*;
public class CeilTheFloor {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length-1;
        int floor=-1,ceil=-1;
        while(low<=high){
            int mid = low + (high - low)/2;

            //if element present in array,it will be floor and ceil
            if(arr[mid]==x){
                return new int[]{arr[mid],arr[mid]};
            }
            //we are looking for element SMALLER than x
            else if(arr[mid]<x){
                low=mid+1;
                floor=arr[mid];
            }else{
                high=mid-1;
                ceil = arr[mid];
            }
        }
        return new int[]{floor,ceil};
    }
}