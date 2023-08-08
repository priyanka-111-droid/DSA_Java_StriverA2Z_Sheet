import java.util.ArrayList;

public class AlternateNumbers {

    //brute force
//    public static int[] alternateNumbers(int []a) {
//        ArrayList<Integer> pos = new ArrayList<>();
//        ArrayList<Integer> neg = new ArrayList<>();
//        int[] res = new int[a.length];
//
//        for(int i=0;i<a.length;i++){
//            if(a[i]>=0){
//                pos.add(a[i]);
//            }else{
//                neg.add(a[i]);
//            }
//        }
//
//        int z=0;
//        for(int i = 0;i<a.length/2;i++){
//            res[z++] = (pos.get(i));
//            res[z++] = (neg.get(i));
//        }
//        return res;
//    }
    //optimal solution
    public static int[] alternateNumbers(int []a) {
        int[] res = new int[a.length];
        int pos=0,neg=1;
        for(int i=0;i<a.length;i++){
            if(a[i]>=0){
                res[pos] = a[i];
                pos+=2;
            }else{
                res[neg] = a[i];
                neg+=2;
            }
        }
        return res;
    }
}