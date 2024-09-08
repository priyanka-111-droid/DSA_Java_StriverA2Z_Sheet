class MissingNumber {

    //method 1 - Linear search (brute force)
    //method 2 - hashing (better)
    //method 3 - Summation (optimal)
    public int missingNumber(int[] nums) {
        int n = nums.length,sum=0;
        //get sum of elements in array
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        //sum of natural numbers from 0 to n
        int natural_sum = (n*(n+1))/2;
        return natural_sum-sum;
    }
    /*
    method 4 - xor (optimal):
    1. xor of 2 same nos are 0
    2. xor of number and 0 is number is itself.

    public static int missingNumber(int []a, int N) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < N - 1; i++) {
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
            xor2 = xor2 ^ a[i]; // XOR of array elements
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]
        return (xor1 ^ xor2); // the missing number
    }
    */
}