public class FindSingleElement{
    //method  1- xor
    //method 2 - hashing
    public static int getSingleElement(int []arr){
        int n = arr.length;
        int i=0;
        while(i+1<=n-1 && arr[i]==arr[i+1]){
            i+=2;
        }
        return arr[i];
    }
}