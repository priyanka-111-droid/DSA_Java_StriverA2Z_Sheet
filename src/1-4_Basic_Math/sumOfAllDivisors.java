public class sumOfAllDivisors {
    static long sumOfDivisorsBruteForce(int n) {
        long sum = 0;
        for(int i=1;i<=n;i++){
            for(int j = 1;j*j<=i;j++){
                if(i%j==0){
                    if(i/j==j){
                        sum+=j;
                    }else{
                        sum+=j+i/j;
                    }
                }
            }
        }
        return sum;
    }
    static long sumOfDivisorsBetter(int n){//O(N),O(1)
//        Let n = 6,
//
//        => F(1) + F(2) + F(3) + F(4) + F(5) + F(6)
//
//                => 1 will occurs 6 times in F(1), F(2),
//
//                F(3), F(4), F(5) and F(6)
//
//                => 2 will occurs 3 times in F(2), F(4) and F(6)
//
//                => 3 will occur 2 times in F(3) and F(6)
//
//                => 4 will occur 1 times in F(4)
//
//                => 5 will occur 1 times in F(5)
//
//                => 6 will occur 1 times in F(6)
        long sum = 0;

        // Iterating from 1 to N.
        for (int i = 1; i <= n; i++) {
            // Calculating and accumulating the sum of divisors.
            sum += (n / i) * i;
        }

        // Returning the sum of divisors.
        return sum;
    }
}