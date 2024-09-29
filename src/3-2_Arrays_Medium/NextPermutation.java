/*
Q)The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container


- Find the Longest Decreasing Suffix
- Identify the Pivot: The element just before the non-increasing suffix is called the pivot. If no pivot is found, it implies the entire array is non-increasing, which means we are at the last permutation and the next one is the first permutation (sorted in ascending order).
- Find a Successor to the Pivot: We again traverse from the end of the array moving backward, looking for the first element larger than the pivot. This successor will be the one we swap with the pivot to ensure we get the next larger permutation.
- Perform the Swap and Reverse the Suffix: As the suffix is in decreasing order, to get the next permutation, we swap the pivot with its successor and then reverse the suffix, turning it from decreasing to increasing, which gives us the least increase necessary to form the next permutation.
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // Length of the array
        int n = nums.length;
        // Initialize the index i to start from the second last element
        int i = n - 2;
        // Find the first pair of two successive numbers a[i] and a[i+1], from right to left, which satisfy a[i] < a[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            // Find the rightmost successor to the pivot
            for (int j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    // Swap the successor and the pivot
                    swap(nums, i, j);
                    break;
                }
            }
        }
        // Reverse the suffix starting right after the pivot point
        int start = i + 1, end = n - 1;
        while (start < end) {
            // Swap the start and end elements of the suffix
            swap(nums, start, end);
            start++;
            end--;
        }

    }
    // Helper function to swap elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}