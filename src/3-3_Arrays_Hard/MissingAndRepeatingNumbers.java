import java.util.*;

public class MissingAndRepeatingNumbers{

    public static int[] findMissingRepeatingNumbers(int []a) {
        int n = a.length;
        int naturalSum = n*(n+1)/2;
        int actualSum=0;
        Set<Integer> set = new HashSet<>();
        int p = -1; //repeated number
        int q = 0; //missing number

        for(int num:a){
            if(set.contains(num)){
                //set already has num
                p = num; //repeated number is num
            }else{
                //set does not have num ,so its added for first time
                set.add(num);
                actualSum+=num;
            }
        }
        q = Math.abs(actualSum-naturalSum);
        return new int[]{p,q};
    }
}