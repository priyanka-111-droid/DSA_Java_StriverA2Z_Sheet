import java.util.* ;
import java.io.*;
class LeftRotateByK {

    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = ob.nextInt();
        }
        int k = ob.nextInt();
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        // create temp array
        int[] temp = new int[k];
        //move first k elements into temp array
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        // shift elements by k positions in arr
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        //attach elements from temp to end of array arr
        for(int i=0;i<k;i++){
            arr[n-k+i]=temp[i];
        }
        //print output
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}