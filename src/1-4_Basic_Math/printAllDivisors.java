import java.util.Arrays;

public class printAllDivisors{
    public static int[] getDivisorsBruteForce(int n){
        int[] divisors = new int[n];
        int count = 0;

        for(int i = 1;i<=n;i++){
            if(n%i==0){
                divisors[count++] = i;
            }
        }
        return divisors;
    }
    public static int[] getDivisorsOptimized(int n){
        int[] divisors = new int[n];
        int count = 0;

        for(int i = 1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                divisors[count++] = i;
            }
            //Add the counterpart divisor
            // if it's different from i
            if(n/i!=i){
                divisors[count++] = n/i;
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(Arrays.toString(getDivisorsBruteForce(n)));
        System.out.println(Arrays.toString(getDivisorsOptimized(n)));
    }
}