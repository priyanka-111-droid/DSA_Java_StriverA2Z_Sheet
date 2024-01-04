import java.util.ArrayList;
public class Search2DMatrix {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int row=0, col=mat.get(0).size()-1;
        while(row<mat.size() && col>=0){
            if((mat.get(row).get(col))==target){
                return true;
            }else if((mat.get(row).get(col))>target){
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
/*
Mistake-
I tried running for loop and then using helper function to do Binary search for each row.
2 loops is bad time complexity.
 */