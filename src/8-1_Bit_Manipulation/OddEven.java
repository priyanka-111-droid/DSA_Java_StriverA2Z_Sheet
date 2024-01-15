public class OddEven {
    public static String oddEven(int N){
        return (N&1)!=0?"odd":"even";

        //N&1 will be non zero if N is odd, and will be 0 if N is even
    }
}