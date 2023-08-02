class reverseNumber {
    public int reverse(int num) {
        int rev = 0  ;

        while(num != 0){
            int rem = num % 10 ;

            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && rem > 7){
                return 0 ;
            }

            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && rem < -8){
                return 0 ;
            }

            rev = rev*10 + rem ;
            num /= 10 ;

        }

        return rev ;
    }
}