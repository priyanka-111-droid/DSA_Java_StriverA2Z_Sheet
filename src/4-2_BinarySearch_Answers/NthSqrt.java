public class NthSqrt{
    public static int NthRoot(int n, int m) {
        int low=0;
        int high=m-1;
        while(low<=high){//loop will be execute until low less than high
            int mid=(low+high)/2;//calculate the mid value for compare
            if(Math.pow(mid, n)==m){//check condition nth root of mid is equal to our target(m) value
                return mid;//if yes then return mid
            }else if(Math.pow(mid, n)<m){//check condition nth root of mid is less our target(m) value
                low=mid+1;//if yes then eliminate the left half
            }
            else{//if above both are condition not setisfide
                high=mid-1;//then eliminate the right half
            }
        }return -1;//if nth root of m not satisfide
    }
}