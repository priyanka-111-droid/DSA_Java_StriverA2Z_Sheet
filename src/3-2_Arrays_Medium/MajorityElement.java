/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.

- hashmap
- moore voting algo
 */

import java.util.HashMap;
public class MajorityElement {
    /*
    method 1 - HashMap:
    public static int majorityElement(int []v) {
        int n = v.length;
        int comparison = (int)Math.floor(n/2);
       HashMap<Integer,Integer> freq = new HashMap<>();
       for(int i=0;i<n;i++){
           int element  =v[i];
           if(freq.containsKey(element)){
               freq.put(element,freq.get(element)+1);
           }else{
               freq.put(element,1);
           }
       }
       for(HashMap.Entry<Integer,Integer> entry: freq.entrySet()){
           if(entry.getValue()>comparison){
               return entry.getKey();
           }
       }
       return 0;
    }
   */
    public int majorityElement(int[] nums) {
        //moore's algo
        int candidate = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        //check if candidate is majority element by counting occurences
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (candidate == nums[i]) {
                count++;
            }
        }

        //check if occurences more than floor(n/2)
        if (count > (int) (Math.floor(nums.length / 2))) {
            return candidate;
        }
        return -1;
    }
}