/*
all possible subsets(power set)
Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]

- Use backtracking.
 */
public class PrintAllSubsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        // Add the current subset to the result
        result.add(new ArrayList<>(tempList));

        // Explore further elements to create subsets
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]); // Include nums[i]
            backtrack(result, tempList, nums, i + 1); // Recur with the next element
            tempList.remove(tempList.size() - 1); // Backtrack and remove the last element
        }
    }
}