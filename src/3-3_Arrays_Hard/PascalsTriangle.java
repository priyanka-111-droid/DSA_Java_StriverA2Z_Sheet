import java.util.*;
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);  // First element in each row is 1

            for (int j = 1; j < i; j++) {
                // Compute value based on the previous row
                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                row.add(value);
            }

            if (i > 0) {
                row.add(1);  // for rows with more than one element, last element in each row is 1,
            }

            triangle.add(row);
        }
        return triangle;
    }
}