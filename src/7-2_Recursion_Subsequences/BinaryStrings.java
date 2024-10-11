/*
given N,generate binary strings of length N,
no 2 consecutive 1's allowed.
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryStrings {



    public static List<String> generateBinaryStrings(int K) {
        List<String> result = new ArrayList<>();
        generateStrings("", K, result);
        return result;
    }

    private static void generateStrings(String current, int remaining, List<String> result) {
        if (remaining == 0) {
            result.add(current);
            return;
        }

        // Add '0' and recurse
        generateStrings(current + "0", remaining - 1, result);

        // Add '1' only if the last character is not '1'
        if (current.isEmpty() || current.charAt(current.length() - 1) != '1') {
            generateStrings(current + "1", remaining - 1, result);
        }
    }

    public static void main(String[] args) {
        int K = 3; // Example size
        List<String> result = generateBinaryStrings(K);
        for (String binaryString : result) {
            System.out.println(binaryString);
        }
    }
}
