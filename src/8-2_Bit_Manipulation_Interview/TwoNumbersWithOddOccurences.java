/*
Input:
N = 8
Arr = {4, 2, 4, 5, 2, 3, 3, 1}
Output: {5, 1}
Explanation: 5 and 1 have odd occurrences.
 */
public class TwoNumbersWithOddOccurences {
    public int[] twoOddNum(int arr[], int N)
    {
        int xorResult = 0;

        // Step 1: XOR all elements to get the XOR of the two odd occurring numbers
        for (int num : arr) {
            xorResult ^= num;
        }

        // Step 2: Find a set bit in the xorResult
        int setBit = xorResult & -xorResult;

        int num1 = 0;
        int num2 = 0;

        // Step 3: Divide numbers into two groups and XOR them
        for (int num : arr) {
            if ((num & setBit) != 0) {
                num1 ^= num; // Group with the set bit
            } else {
                num2 ^= num; // Group without the set bit
            }
        }
//        Suppose num1 ends up holding the result of one odd-occurring number (say a) and num2 holds the other odd-occurring number (say b).The result will be that num1 will contain one of the odd-occurring numbers and num2 will contain the other.
//        All numbers with even occurrences will cancel each other out in the XOR operation.


        // Step 4: Return the results in decreasing order
        return num1 > num2 ? new int[]{num1, num2} : new int[]{num2, num1};
    }
}