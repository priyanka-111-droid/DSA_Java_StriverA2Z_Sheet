import java.util.*;
public class SpiralMatrix {
    public static int[] spiralMatrix(int [][]MATRIX) {
        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int dir=0;
        int top=0,bottom = n-1;
        int left=0,right=m-1;
        ArrayList<Integer> ans = new ArrayList<>();

        while(top<=bottom && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    // System.out.print(MATRIX[top][i]+" ");
                    ans.add(MATRIX[top][i]);
                }
                top+=1;
            }else if(dir==1){
                for(int i=top;i<=bottom;i++){
                    // System.out.print(MATRIX[i][right]+" ");
                    ans.add(MATRIX[i][right]);
                }
                right-=1;
            }else if(dir==2){
                for(int i=right;i>=left;i--){
                    //    System.out.print(MATRIX[bottom][i]+" ");
                    ans.add(MATRIX[bottom][i]);
                }
                bottom-=1;
            }else if(dir==3){
                for(int i=bottom;i>=top;i--){
                    // System.out.print(MATRIX[i][left]+" ");
                    ans.add(MATRIX[i][left]);
                }
                left+=1;
            }
            dir=(dir+1)%4;
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}