//check if array sorted in ascending order
public class NinjaAndTheSortedCheck{
    public static int isSorted(int n, int []a) {
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(a[j]<a[i]){
                return 0;
            }
        }
        return 1;
    }
}