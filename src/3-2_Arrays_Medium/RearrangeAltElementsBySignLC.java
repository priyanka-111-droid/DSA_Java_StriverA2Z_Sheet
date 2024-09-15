public class RearrangeAltElementsBySignLC {

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
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pos = 0,neg = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                res[pos] = nums[i];
                pos+=2;// Note that since every other index will be odd and every other index will be even, both pointers would increment by 2 rather than 1.
            }else{
                res[neg] = nums[i];
                neg+=2;
            }
        }
        return res;
    }
}