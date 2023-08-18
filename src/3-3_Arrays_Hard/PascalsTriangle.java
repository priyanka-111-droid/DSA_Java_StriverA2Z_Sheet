import java.util.*;
public class PascalsTriangle {
    public static int[][] pascalTriangle(int N) {
        int[][] triangle = new int[N][];

        for (int i = 0; i < N; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;  // First element in each row is 1

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

            triangle[i][i] = 1;  // Last element in each row is 1
        }

        return triangle;
    }
}