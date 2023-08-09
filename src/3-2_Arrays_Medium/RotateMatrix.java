import java.util.*;

//Q)rotate matrix by 90deg clockwise
//Ans)transpose and then reverse each row
public class RotateMatrix {
    public static void rotateMatrix(int [][]matrix){
        int n = matrix.length;
        //determines the transpose of the matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                //do not swap main diagonal elements(where i==j)\
                //for rest elements,swap
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        //then we reverse the elements of each row
        for(int i=0;i<n;i++)
        {
            //logic to reverse each row i.e 1D Array.
            int low = 0, high = n-1;
            while(low < high)
            {
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
}