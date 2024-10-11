public class OddEven {
    static String oddEven(int n) {
        return (n&1)==0?"even":"odd";
        //n&1 will be 0 if n is even
    }
}