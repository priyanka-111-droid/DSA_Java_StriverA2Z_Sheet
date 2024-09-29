/*
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

 */
public class Search_2DMatrix_2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            boolean flag = binarySearch(matrix[i], target);
            if (flag == true) return true;
        }
        return false;
    }
    public static boolean binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return true;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
