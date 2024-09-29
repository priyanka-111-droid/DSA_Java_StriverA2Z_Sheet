/*
Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.

 */

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeadersGFG {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {//O(N),O(N)
        ArrayList<Integer> ans = new ArrayList();

        //number on rightmost side always leader
        int leader = arr[n-1];
        ans.add(leader);

        for(int i = n-2;i>=0;i--){
            if(arr[i]>=leader){
                ans.add(arr[i]);
                leader=arr[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }

}