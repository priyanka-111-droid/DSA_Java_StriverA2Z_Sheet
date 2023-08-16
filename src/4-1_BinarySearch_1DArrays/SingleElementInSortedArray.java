

import java.util.ArrayList;
public class SingleElementInSortedArray {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        //xor method
        //xor of 2 same numbers is 0
        //xor of 0 and a number is that number
        int result=0;

        for(int i=0;i<arr.size();i++){

            result=result^arr.get(i);

        }

        return result;
    }
}