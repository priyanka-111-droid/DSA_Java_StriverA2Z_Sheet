import java.util.* ;
import java.io.*;

//Q)If any element in matrix is 0,convert full row and column to 0;

public class ZeroMatrix {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        ArrayList<ArrayList<Integer>> copyMatrix = new ArrayList<>();
        // Create a copy of the matrix
        for (ArrayList<Integer> row : matrix) {
            copyMatrix.add(new ArrayList<>(row));
        }

        //row
        for (int i = 0; i < n; i++) {
            //column
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    for (int k = 0; k < n; k++) {
                        copyMatrix.get(k).set(j, 0); // Set entire column to 0
                    }
                    for (int k = 0; k < m; k++) {
                        copyMatrix.get(i).set(k, 0); // Set entire row to 0
                    }
                }
            }
        }

        return copyMatrix;
    }
}
