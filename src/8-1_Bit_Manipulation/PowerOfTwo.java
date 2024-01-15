public class PowerOfTwo{
    public static boolean isPowerOfTwo(int n) {
        return ((n & n-1)==0);
    }
}
// All the power of 2 have only single bit set
//  e.g. 16 (00010000). If we minus 1 from this,
//  all the bits from LSB to set bit get toggled,
//   i.e., 16–1 = 15 (00001111).
//   Now if we AND x with (x-1) and the result is 0
//   then we can say that x is power of 2 otherwise not.