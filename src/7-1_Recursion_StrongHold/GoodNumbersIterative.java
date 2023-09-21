import java.util.*;
public class GoodNumbersIterative{
        public static boolean isGood(int n,int digit){
            int last = n%10;
            int sum=last;
            if (last == digit)
                return false;

            // // Traverse remaining digits
            n /= 10;

            while(n>0){
                int x = n%10;
                if(x==digit || x<=sum){
                    return false;
                }else{
                    sum=sum+x;
                    n/=10;
                }
            }
            return true;
        }


        public static List< Integer > goodNumbers(int a, int b, int digit) {
            // Write your code here.
            List<Integer> res = new ArrayList<>();
            for(int i=a;i<=b;i++){
                if(isGood(i,digit)){
                    res.add(i);
                }
            }
            return res;
        }
}
