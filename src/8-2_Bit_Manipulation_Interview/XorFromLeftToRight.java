

public class XorFromLeftToRight {
    public static int findXOR(int l, int r) {
//        XOR(Lto R)=XOR(0toR)⊕XOR(0to(L−1))
        return xorUpto(r) ^ xorUpto(l - 1);
    }
    // Function to compute XOR from 0 to n using n mod 4
    private static int xorUpto(int n) {
        //based on pattern of xor from 0 to n(eg xor upto 0, exor upto 1,etc)
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0; // when n % 4 == 3
    }
}
