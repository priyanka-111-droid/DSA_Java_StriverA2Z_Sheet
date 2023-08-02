public class Nto1WithoutLoop
{
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        return helper(arr,x,1);
    }
    private static int[] helper(int[] arr,int x,int i){
        arr[x-1] = i;
        if(x==1){
            return arr;
        }
        return helper(arr,x-1,i+1);
    }
}