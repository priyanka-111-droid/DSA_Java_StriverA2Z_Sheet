/*
sum of first n natural numbers:
- for loop way
- nat nos formula
- recursion(param,functional)
 */
public class sumOfFirstNNumbers {
    public static int sumFirstNParamRecursive(int n) {//O(N),O(N)
        // functional recursive way
        if(n<=0){
            return 0;
        }
        return n+sumFirstNParamRecursive(n-1);
    }
    public static void sumFirstNFuncRecursive(int n,int sum){//O(N),O(N)
        //parameterized recursive way,tail recursion(if Java implemented it),in this case SC is till O(N)
        if(n<1){
            System.out.println(sum);
            return;
        }

        // Function call to increment sum by i till i decrements to 1.
        sumFirstNFuncRecursive(n-1,sum+n);
    }

    public static void main(String[] args) {
        int n = 5;
        sumFirstNFuncRecursive(n,0);
    }
}