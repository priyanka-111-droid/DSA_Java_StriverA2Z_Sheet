/*
count the frequency of all elements from 1 to N in the array.
Input: n = 5, arr[] = [2, 3, 2, 3, 5], p = 5
Output: [0, 2, 2, 0, 1]
 */
public class FreqOfLimitedRangeArray {
        public static void frequencyCount(int arr[], int n, int p) {//O(N) as single traversal takes O(N),O(1) space,
            int freqArray[] = new int[n];
            for(int i = 0;i<n;i++){
                if (arr[i] >= 1 && arr[i] <= n) {
                    freqArray[arr[i] - 1]++;
                }
            }
            for(int i = 0;i<n;i++){
                arr[i] = freqArray[i];
            }
        }
}