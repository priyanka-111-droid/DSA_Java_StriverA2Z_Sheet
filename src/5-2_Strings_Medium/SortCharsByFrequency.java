import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharsByFrequency {
    public String frequencySort(String s) {
        // Create a frequency map
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Create a list of characters sorted by frequency
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Build the result string based on sorted frequencies
        StringBuilder sortedString = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entryList) {
            char ch = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                sortedString.append(ch);
            }
        }

        return sortedString.toString();
    }
}
