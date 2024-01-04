//hashing using Map->less memory than array hashing

import java.util.*;
public class HighestLowest {
    //using Hashmap
    public static int[] getFrequencies(int []v) {

        int n = v.length;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            if (freq.containsKey(v[i])) {
                freq.put(v[i], freq.get(v[i]) + 1);
            }
            else {
                freq.put(v[i], 1);
            }
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count >= maxFreq) {
                if(count==maxFreq){
                    maxEle = Math.min(maxEle,element);
                    maxFreq = count;
                }else{
                    maxEle = element;
                    maxFreq = count;
                }
            }

            if (count <= minFreq) {
                if(count==minFreq){
                    minEle = Math.min(minEle,element);
                    minFreq = count;
                }else{
                    minEle = element;
                    minFreq = count;
                }
            }
        }
        int[] arr = new int[]{maxEle,minEle};
        return arr;
    }
}