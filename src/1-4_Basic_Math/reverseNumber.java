class reverseNumber {
    public int reverse(int num) {
        int rev = 0  ;

        while(num != 0){
            int rem = num % 10 ;

            //Positive Overflow: If rev is greater than Integer.MAX_VALUE / 10 or exactly Integer.MAX_VALUE / 10 and rem is greater than 7, adding rem would exceed the maximum value an int can hold.
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && rem > 7){
                return 0 ;
            }

            //Negative Overflow: If rev is less than Integer.MIN_VALUE / 10 or exactly Integer.MIN_VALUE / 10 and rem is less than -8, adding rem would be less than the minimum value an int can hold.
            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && rem < -8){
                return 0 ;
            }

            rev = rev*10 + rem ;
            num /= 10 ;

        }

        return rev ;
    }
}
/*
The overflow checks are crucial because reversing a number
could potentially result in a number outside the range of valid 32-bit integers
(Integer.MAX_VALUE is 2^31 - 1 and Integer.MIN_VALUE is -2^31).
 */