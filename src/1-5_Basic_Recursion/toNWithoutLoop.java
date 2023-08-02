public class toNWithoutLoop {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        return helper(arr,0,x);
    }
    private static int[] helper(int[] arr,int i,int x){
        arr[i]=i+1;
        if(i==x-1){
            return arr;
        }
        return helper(arr,i+1,x);
    }
}