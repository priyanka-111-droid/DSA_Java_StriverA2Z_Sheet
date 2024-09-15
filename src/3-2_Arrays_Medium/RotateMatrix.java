import java.util.*;

//Q)rotate matrix by 90deg clockwise
//Ans)transpose and then reverse each row
public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //1) get transpose of matrix(row->col)
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                if(i!=j){//if element not on main diagonal,do transpose
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
        }
        //2)row reversal
        for(int i = 0;i<n;i++){
            int low = 0,high=n-1;
            while(low<=high){
                int tmp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = tmp;
                low++;
                high--;
            }
        }
    }
}