/*
Given an array arr[] sorted in ascending order of size N and an integer K. Check if K is present in the array or not.
 */
public class LinearSearch {
    static int searchInSorted(int arr[], int N, int K) {
        for(int i:arr){
            if(i==K){
                return 1;
            }
        }
        return -1;
    }
}