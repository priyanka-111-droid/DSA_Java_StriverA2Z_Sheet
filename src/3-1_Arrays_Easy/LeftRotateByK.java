/*
arr=[1,2,3,4,5,6,7],k=2
o/p: 3 4 5 6 7 1 2

- temp array
- in place rotation, using reversal algorithm.
 */
public class LeftRotateByK{
    public void rotateWithTemp(int[] arr,int k){//O(N),O(k)
        int n = arr.length;
        if (n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[k];
        //Copy the first k elements into the temp array.
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        //Shift n-k elements from last by k position to the left
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        //Copy the elements into the main array from the temp array.
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }
    public void rotateWithoutTemp(int[] arr, int k) {//O(N),O(1)
            int n = arr.length;
            if(n==0){
                return;
            }
            k=k%n; // Ensure k is within the bounds of the array length
            if(k==0){
                return;
            }

        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        reverse(arr, k , n - 1);
        // Reverse whole array
        reverse(arr, 0, n - 1);
        }
        private void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}