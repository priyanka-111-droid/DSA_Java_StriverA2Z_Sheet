/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target.
You may return the combinations in any order.
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Sol:
The algorithm uses a backtracking approach to explore all possible combinations of the candidates.
It includes a candidate in the current combination (ds) and recursively explores further until it either reaches a valid combination or exceeds the target.
If the target is reached, it records the combination. If it exceeds the target, it backtracks by removing the last candidate and trying the next one.
This process continues until all candidates have been considered.
 */
public class CombinationSum1{
    public List < List < Integer >> combinationSum(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    private void findCombinations(int index, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        //ds is current combination being built
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (ds));//add current combination to ans because it's a valid combination that sums to the original target.
            }
            return;
        }

        //include current candidate
        if (arr[index] <= target) {
            ds.add(arr[index]);//adds candidate
            findCombinations(index, arr, target - arr[index], ans, ds);//calls findCombinations recursively without incrementing ind. This allows using the same candidate again.
            ds.remove(ds.size() - 1);// it removes the last added candidate from ds (backtracking) to explore other combinations.
        }

        //exclude current candidate(so do index+1)
        findCombinations(index + 1, arr, target, ans, ds);
    }
}