import java.util.ArrayList;
public class RowWithMaxOnes_BruteForce
{
    public static int numberOfOnes(ArrayList<Integer> row){
        int num=0;
        for(int i=0;i<row.size();i++){
            if(row.get(i)==1){
                num++;
            }
        }
        return num;
    }
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        int maxi=0,maxRowIndex=0,flag=-1;

        for(int i=0;i<n;i++){
            ArrayList<Integer> row = matrix.get(i);
            int numOnes = numberOfOnes(row);
            if(numOnes!=0){
                flag=1;
            }
            if(numOnes>maxi){
                maxi=numOnes;
                maxRowIndex=i;
            }
        }
        return maxRowIndex;
    }
}