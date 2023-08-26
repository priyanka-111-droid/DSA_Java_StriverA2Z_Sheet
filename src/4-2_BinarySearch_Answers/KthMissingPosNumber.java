public class KthMissingPosNumber {
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.
        for (int i = 0; i < n; i++) {
            if (vec[i] <= k) k++; //shifting k
            else break;
        }
        return k;
    }
}