import java.util.*;

public class ThreeSum{
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {  // Avoid duplicate triplets
                int left = i + 1;
                int right = n - 1;
                int target = -arr[i];

                while (left < right) {
                    if (arr[left] + arr[right] == target) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[left]);
                        triplet.add(arr[right]);
                        triplets.add(triplet);

                        while (left < right && arr[left] == arr[left + 1]) left++;  // Avoid duplicate elements
                        while (left < right && arr[right] == arr[right - 1]) right--;  // Avoid duplicate elements

                        left++;
                        right--;
                    } else if (arr[left] + arr[right] < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return triplets;
    }
}