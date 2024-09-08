/*
without sorting,get second largest, else return -1.
 */
class SecondLargestWithoutSorting {
    public int getSecondlargest(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int secondMaxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                // Update both largest and second largest
                secondMaxi = maxi;
                maxi = arr[i];
            } else if (arr[i] < maxi && arr[i] > secondMaxi) {
                // Update only the second largest
                secondMaxi = arr[i];
            }
        }

        // Check if there was a valid second largest element
        return secondMaxi == Integer.MIN_VALUE ? -1 : secondMaxi;
    }
}