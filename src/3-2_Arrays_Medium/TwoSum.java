
public class TwoSum {

    public static String read(int n, int []book, int target){

// Write your code here.

        for (int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                if(book[j]+book[i] == target) return "YES";

            }

        }

        return "NO";

    }

}