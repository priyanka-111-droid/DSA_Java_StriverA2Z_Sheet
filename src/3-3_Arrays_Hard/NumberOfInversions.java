//Count number of inversions -
// An inversion occurs when two elements in the array are out of order
// with respect to their indices. We are counting inversions where the
// index i is less than index j,but the value at index i is greater than
// the value at index j.
public class NumberOfInversions {
    public static int numberOfInversions(int[] nums,int n) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private static int mergeSortAndCount(int[] nums, int left, int right) {
        int inversions = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;
            inversions += mergeSortAndCount(nums, left, mid);
            inversions += mergeSortAndCount(nums, mid + 1, right);
            inversions += merge(nums, left, mid, right);
        }

        return inversions;
    }

    private static int merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        int inversions = 0;


        //For every element nums[i] in the left subarray (from index left to mid),
        // if it's greater than an element nums[j] in the right subarray
        // (from index mid + 1 to right), it implies that there are mid - i + 1
        // elements in the left subarray that are greater than nums[j].
        // This is because both subarrays are sorted, so the elements after nums[i]
        // in the left subarray will also be greater than nums[j].
        while (i <= mid && j <= right) {
            if (nums[i] > nums[j]) {
                inversions += mid - i + 1;
                temp[k++] = nums[j++];
            } else {
                temp[k++] = nums[i++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        System.arraycopy(temp, 0, nums, left, temp.length);
        return inversions;
    }


    /**
     * WRONG ANSWER: Time limit exceeded
    public static int numberOfInversions(int []a, int n) {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
        }
        return count;
    }
    */
}