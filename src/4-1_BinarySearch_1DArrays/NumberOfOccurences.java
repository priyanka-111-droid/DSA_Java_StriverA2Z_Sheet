public class NumberOfOccurences {
    //given array is sorted
    public static int count(int arr[], int n, int x) {
        int firstOccurrence = findFirstOccurrence(arr, n, x);

        if (firstOccurrence == -1) {
            // If the element doesn't exist in the array
            return 0;
        }

        int lastOccurrence = findLastOccurrence(arr, n, x);

        return lastOccurrence - firstOccurrence + 1;
    }

    private static int findFirstOccurrence(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1; // Search in the left half
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    private static int findLastOccurrence(int arr[], int n, int x) {
        int low = 0;
        int high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                low = mid + 1; // Search in the right half
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}