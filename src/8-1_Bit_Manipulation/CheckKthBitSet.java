public class CheckKthBitSet {
    static boolean isKthBitSet(int n, int k) {
        return (int) (((n>>k-1) & 1))==1?true:false;

    }
}

//Right shifting num by position
//will make bit #position be in the
//furthest spot to the right in the number.
//Combining that with the bitwise AND & with 1
//will tell you if the bit is set.