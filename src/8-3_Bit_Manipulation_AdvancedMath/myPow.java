/*
power(x,n)
->fast exponentiation
 */
public class myPow {
    public double myPow(double x, int n) {
        return fastExponentiation(x,n);
    }
    private double fastExponentiation(double b,double n){
        // Base case: any number raised to the power of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Handle the case where n is Integer.MIN_VALUE
        if (n == Integer.MIN_VALUE) {
            //If n is Integer.MIN_VALUE, instead of simply converting -n,we use MAX_VALUE to avoid overflow
            return 1 / (b * fastExponentiation(b, Integer.MAX_VALUE));
        }

        // If n is negative, convert to positive and take the reciprocal
        if (n < 0) {
            return 1 / fastExponentiation(b, -n);
        }

        // Recursive case for even n
        if (n % 2 == 0) {
            double halfPow = fastExponentiation(b, n / 2);
            return halfPow * halfPow; // square the result of the half exponent
        } else {
            // Recursive case for odd n
            return b * fastExponentiation(b, n - 1); // reduce the exponent by 1
        }
    }
}