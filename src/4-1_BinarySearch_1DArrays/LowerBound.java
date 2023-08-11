public class LowerBound{
    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                // If the middle element is greater than or equal to x,
                // move the high pointer to the left
                high = mid - 1;
            } else {
                // If the middle element is less than x, move the low pointer to the right
                low = mid + 1;
            }
        }

        // At the end of the loop, low will be the first index where arr[low] is >= x
        return low;
    }
}
