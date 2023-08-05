

public class quickSort {

    /*
    The function is called with the parameters:
    quickSort(input, 0, size - 1);

*/
    static int partitionArray(int input[], int start, int end) {
        //find and return partition index

        //assume pivot is initially first element in array
        int pivot = input[start];
        int i = start;
        int j = end;
        while(i<j){
            while(input[i]<=pivot && i<=end-1){
                i++;
            }
            while(input[j]>pivot && j>=start+1){
                j--;
            }
            if(i<j){
                int temp = input[i];
                input[i]=input[j];
                input[j]=temp;
            }
        }

        int temp = input[start];
        input[start] = input[j];
        input[j] = temp;
        return j; //partition Index

    }

    static void quickSort(int input[], int start, int end) {
        if(start<end){
            //find partition Index
            int partitionIndex = partitionArray(input,start,end);
            //leave partitionIndex alone,
            //sort subarrays to left and right of partitionIndex recursively
            quickSort(input,start,partitionIndex-1);
            quickSort(input,partitionIndex+1,end);
        }
    }

}