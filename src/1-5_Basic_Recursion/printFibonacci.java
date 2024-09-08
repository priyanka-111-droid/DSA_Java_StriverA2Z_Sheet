import java.util.HashMap;

/*
given n,return fib(n)
 */
public class printFibonacci {

    public int fibBruteforce(int n) {//O(phi^n),O(n)
        //fib recursive
        if(n==0 || n==1){
            return n;
        }
        return fibBruteforce(n-1)+fibBruteforce(n-2);
    }
    public int fibBetter(int n) {//O(n),O(n)
        //memoization(recursive + caching)
       HashMap<Integer,Integer> hmap = new HashMap<>();
       hmap.put(0,0);
       hmap.put(1,1);
       if(!hmap.containsKey(n)){
         hmap.put(n,fibBetter(n-1)+fibBetter(n-2));
       }
       return hmap.get(n);
    }
    public int fibOptimal(int n){//O(n),O(1)
            //iterative
            if(n<=1){
                return n;
            }
            int a = 0,b=1,c = 0;
            for(int i = 2;i<=n;i++){
                c = a+b;
                a=b;
                b=c;
            }
            return c;
    }
}