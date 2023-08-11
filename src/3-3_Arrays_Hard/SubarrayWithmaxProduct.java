public class SubarrayWithmaxProduct {
    //kadane algo
    public static int subarrayWithMaxProduct(int[] arr) {
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                // Swap maxEndingHere and minEndingHere if the current element is negative
                int temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }

            // Update maxEndingHere and minEndingHere
            maxEndingHere = Math.max(arr[i], arr[i] * maxEndingHere);
            minEndingHere = Math.min(arr[i], arr[i] * minEndingHere);

            // Update maxSoFar with the maximum value
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}