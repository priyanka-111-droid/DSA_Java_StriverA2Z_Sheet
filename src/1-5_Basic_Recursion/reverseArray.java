public class reverseArray {
    public static int[] reverseArray(int n, int []nums) {
        return helper(0,n-1,nums);

    }
    private static int[] helper(int i,int j,int[] arr){
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            return helper(i+1,j-1,arr);
        }
        return arr;
    }
}