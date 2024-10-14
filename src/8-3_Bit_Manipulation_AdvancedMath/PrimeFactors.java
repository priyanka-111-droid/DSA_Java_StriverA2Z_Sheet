public class PrimeFactors {
    public int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2;i*i<=(N);i++){
            if(N%i==0)
                arr.add(i);

            while(N%i==0){
                N/=i;
            }
        }
        if(N!=1){
            arr.add(N);
        }

        int[] res = new int[arr.size()];
        for(int i = 0;i<res.length;i++){
            res[i] = arr.get(i);
        }

        return res;
    }
}