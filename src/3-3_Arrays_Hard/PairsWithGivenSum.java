import java.util.*;

//count pairs with given sum
public class PairsWithGivenSum
{
    public static long pairsWithGivenSum(int arr[], int sum)
    {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        long count = 0;

        for (int num : arr) {
            int complement = sum - num;
            count += frequencyMap.getOrDefault(complement, 0);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}


