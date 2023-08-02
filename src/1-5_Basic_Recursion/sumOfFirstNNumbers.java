public class sumOfFirstNNumbers {
    public static int sumFirstN(int n) {
        // Write Your Code Here
        if(n<=0){
            return 0;
        }
        return n+sumFirstN(n-1);
    }
}