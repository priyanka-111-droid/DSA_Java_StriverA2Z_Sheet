public class checkPrime {
    public static String isPrime(int num) {
        if(num<=1){
            return "NO";
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return "NO";
            }
        }
        return "YES";
    }
}