public class SieveOfErathosthenes {
    class Solution {
        public int countPrimes(int n) {
            //if n less than 2 ,no primes nos less than n
            if(n<=2){
                return 0;
            }
            int primeCount = countPrimesHelper(n);
            return primeCount;
        }
        private static int countPrimesHelper(int n){
            boolean[] isPrime = new boolean[n];

            // Initialize all numbers as prime
            for (int i = 2; i < n; i++) {
                isPrime[i] = true;
            }
            // Implementing the Sieve of Eratosthenes
            // It marks non-prime numbers by iterating from 2 to the square root of n.
            // For each prime number found, it marks all its multiples as non-prime.
            for (int i = 2; i * i < n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            // Count the number of prime numbers
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            return count;
        }
    }
}