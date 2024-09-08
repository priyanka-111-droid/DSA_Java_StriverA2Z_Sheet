public class checkPrime {
    static boolean isPrime(int n){

        // Initialize a counter variable to
        // count the number of factors.
        int cnt = 0;

        // Loop through numbers from 1
        // to the square root of n.
        for(int i = 1; i <= Math.sqrt(n); i++){

            // If n is divisible by i
            // without any remainder.
            if(n % i == 0){

                // Increment the counter.
                cnt = cnt + 1;

                // If n is not a perfect square,
                // count its reciprocal factor.
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }

        // If the number of
        // factors is exactly 2.
        // Return true, indicating
        // that the number is prime.
        return cnt == 2;
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = isPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

