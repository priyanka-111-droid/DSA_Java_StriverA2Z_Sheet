import java.util.*;
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {//O(mxn),O(1)
        int rowCount = matrix.length;//m is row count
        int colCount = matrix[0].length;//n is column count
        int dir=0;//cover 4 possible directions
        int top=0,bottom = rowCount-1;
        int left=0,right=colCount-1;
        List<Integer> ans = new ArrayList<>();

        while(top<=bottom && left<=right){
            if(dir==0){
                //move left to right
                for(int i=left;i<=right;i++){
                    ans.add(matrix[top][i]);
                }
                top+=1;//top row elements already added so inc by 1
            }else if(dir==1){
                //move top to bottom
                for(int i=top;i<=bottom;i++){
                    ans.add(matrix[i][right]);
                }
                right-=1;
            }else if(dir==2){
                //move right to left
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom-=1;
            }else if(dir==3){
                //move bottom to top
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left+=1;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }

}