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
    /* Method 2 - Moore voting algo(optimal)
    * used to find the majority element in an array, which is an element that appears more than half of the time
    * */
    public static int majorityElement(int []v) {
        //candidate and count keep track of the current candidate and its count
        int candidate=0,count=0;
        for(int i=0;i<v.length;i++){
            if(count==0){
                candidate=v[i];
                count=1;
            }
            else if(candidate==v[i]){
                count++;
            }else{
                count--;
            }
        }
        // Verify if the candidate is the actual majority element by counting its occurences
        count = 0;
        for (int i=0;i<v.length;i++) {
            if (v[i] == candidate) {
                count++;
            }
        }

        //check if its occurences is more than floor/2
        if(count>(int)Math.floor(v.length/2)){
            return candidate;
        }
        return -1;
    }
}