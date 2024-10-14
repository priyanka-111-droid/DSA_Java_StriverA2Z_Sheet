/*
// find prime factors of N using sieve of erathosthenes
 */
public class PrimeFactorsOfNUsingSieve {

    static List<Integer> findPrimeFactors(int N) {

        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[N+ 1];

        // Assume all numbers are prime initially
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        // Marking multiples of p as not prime
        for (int p = 2; p * p <= N; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= N; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Collecting all prime factors of N.
        // The function effectively finds all prime factors of N by first identifying all primes up to N using the Sieve of Eratosthenes,
        // then checking which of those primes divide
        // N and collecting them as factors.
        for (int p = 2; p <= N; p++) {
            if (isPrime[p] && N%p==0) {
                while(N%p==0){
                    primes.add(p);
                    N/=p;
                }

            }
        }

        return primes;
    }
}