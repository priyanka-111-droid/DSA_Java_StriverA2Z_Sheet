public class sumOfAllDivisors {
    public static int sumofDivisors(int n){
        int s=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                s=s+i;
            }
        }
        return s;
    }
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+sumofDivisors(i);
        }
        return s;
    }
}