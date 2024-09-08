/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

- using temp array
- without temp array,inplace(using reversal algo)
 */
class RightRotateByK {

       public void rotateWithTemp(int[] arr,int k){//O(N),O(k)
           int n = arr.length;
           if (n == 0)
               return;
           k = k % n;
           if (k > n)
               return;
           int[] temp = new int[k];
           //Copy the last k elements into the temp array.
           for (int i = n - k; i < n; i++) {
               temp[i - n + k] = arr[i];
           }
           //Shift n-k elements from the beginning by k position to the right
           for (int i = n - k - 1; i >= 0; i--) {
               arr[i + k] = arr[i];
           }
           for (int i = 0; i < k; i++) {
               arr[i] = temp[i];
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

            // Reverse last k elements
            reverse(arr, n - k, n - 1);
            // Reverse first n-k elements
            reverse(arr, 0, n - k - 1);
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