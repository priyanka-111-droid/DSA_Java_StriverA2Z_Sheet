public class bubbleSortRecursive {
    public static void bubble_sort(int[] arr, int n) {
        if (n == 1) return; //base case
        for (int j = 0; j <= n - 2; j++) {

            //swapping
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }

        }
        //Range reduced after recursion:
        bubble_sort(arr, n - 1);
    }
}