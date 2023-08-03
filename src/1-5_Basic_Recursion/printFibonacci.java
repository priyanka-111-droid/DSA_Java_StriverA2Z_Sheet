public class printFibonacci {
    public static void recursion(int a, int b, int n, int arr[], int index){
        if(n == 0)
            return;
        arr[index] = a;
        recursion(b, a+b, n-1, arr, index+1);
    }
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int a=0, b=1, index = 0;
        int arr[] = new int[n];
        recursion(a, b, n, arr, index);
        return arr;
    }
}
/**
 * by ITERATION:
 * public class Solution {
 *     public static int[] fib(int n){
 *         int[] arr = new int[n];
 *         int z=0;
 *
 *         int count=1;
 *         int a=0,b=1;
 *         if(n<1){
 *             return arr;
 *         }
 *
 *         arr[z++] = a;
 *         while(count<n){
 *             arr[z++] = b;
 *             int c = a + b;
 *             a = b;
 *             b = c;
 *             count++;
 *         }
 *         return arr;
 *     }
 *     public static int[] generateFibonacciNumbers(int n) {
 *         // Write your code here.
 *        return fib(n);
 *     }
 * }
 */