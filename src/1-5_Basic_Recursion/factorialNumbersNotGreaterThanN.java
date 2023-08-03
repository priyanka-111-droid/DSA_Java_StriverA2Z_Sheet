import java.util.List;
import java.util.ArrayList;
public class factorialNumbersNotGreaterThanN {
    public static List<Long> factorialNumbers(long n) {

        List<Long> arr = new ArrayList<Long>();

        return factN(arr,1L,n);

    }
    static long fact = 1L;
    public static List<Long> factN(List<Long> arr,long num,long n){

        fact*=num;

        if(fact>n){

            return arr;

        }
        arr.add(fact);
        return factN(arr,num+1,n);

    }
}