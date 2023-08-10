import java.util.*;
public class FourSum{
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        Arrays.sort(nums);

        //This is because we need at least four elements to form a quadruplet,
        //so we stop before the last three elements
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            //Inside the loop, we're checking
            //if the current element is the same as the
            //previous element.
            //If it is, we skip this iteration to avoid duplicate
            //solutions. This is an important step to ensure unique
            //quadruplets.

            for (int j = i + 1; j < nums.length - 2; j++) {
                // This is because we're looking for a second element
                //in the quadruplet,
                // so we need to have at least three elements after it.
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;


                //We're initializing two pointers: left and right.
                //These pointers will help us find the other two elements
                //in the quadruplet.
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        //We're handling duplicate elements by
                        //moving the left pointer and right pointer
                        //one step if they point to duplicate elements.
                        //This ensures that we don't count the same
                        //solution multiple times.
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        //move pointers to search for other solutions
                        left++;
                        right--;
                    } else if (sum < target) {
                        //move pointer ahead to try bigger target
                        left++;
                    } else {
                        //move pointer back to try smaller number
                        right--;
                    }
                }
            }
        }
        return quadruplets;
    }
}