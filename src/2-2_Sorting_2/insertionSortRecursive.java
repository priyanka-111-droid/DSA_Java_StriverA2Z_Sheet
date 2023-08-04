public class insertionSortRecursive {

    static void insertionSort(int[] arr,int n){
        insertion_sort_helper(arr, 0, n);
    }
    static void insertion_sort_helper(int arr[], int i, int n) {

        // Base Case: i == n.
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion_sort_helper(arr, i + 1, n);
    }
}