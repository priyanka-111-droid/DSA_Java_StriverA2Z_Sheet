import java.util.*;
public class SuperiorElements {
    public static List< Integer > superiorElements(int [] a) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n= a.length;

        int max= Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){

            if(a[i]>max){

                ans.add(a[i]);

            }

            max= Math.max(max,a[i]);

        }

        return ans;
    }
}