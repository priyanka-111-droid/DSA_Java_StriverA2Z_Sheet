public class Intro_to_Bit_Manipulation {
    private static int getBitAtPos(int pos,int num){
        return (int) (((num>>pos-1) & 1));//pos-1 since we are starting bits from 1

        //Right shifting num by position
        //will make bit #position be in the
        //furthest spot to the right in the number.
        //Combining that with the bitwise AND & with 1
        //will tell you if the bit is set.
    }
    private static int setBitAtPos(int pos,int num){
        num = num | (1<<pos-1);
        return (int)(num);

        //First we left shift ‘1’ to n position via (1<<n)
        //Then, use ‘OR’ operator to set bit at that position.
        //’OR’ operator is used because it will set the bit even
        //if the bit is unset previously in binary representation of number ‘num’.
    }
    private static int clearBitAtPos(int pos,int num){
        num &= (~(1 << pos-1));
        return (int)num;
        //First we left shift ‘1’ to n position via (1<<n) than we use bitwise NOT operator ‘~’ to unset this shifted ‘1’.
        //Now after clearing this left shifted ‘1’ i.e making it to ‘0’
        //we will ‘AND’(&) with the number ‘num’
        //that will unset bit at nth position position.
    }
    public static int[] bitManipulation(int num, int i){
        int get = getBitAtPos(i,num);
        int set = setBitAtPos(i,num);
        int clear = clearBitAtPos(i, num);
        return new int[]{get,set,clear};
    }
}