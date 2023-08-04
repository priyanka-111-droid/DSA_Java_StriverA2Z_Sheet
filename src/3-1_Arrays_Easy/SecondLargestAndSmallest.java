import java.util.Arrays;

class SecondLargestAndSmallest{
        public static int[] getSecondOrderElements(int n, int []a) {
            int maxi = Integer.MIN_VALUE;
            int secondmaxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;
            int secondmini = Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                if(a[i]>=maxi){ //only works if array ascending
                    secondmaxi = maxi;
                    maxi = a[i];
                }
                else if(a[i]>secondmaxi && a[i]!=maxi){
                    secondmaxi = a[i];
                }

                if(a[i]<=mini){
                    secondmini = mini;
                    mini = a[i];
                }
                else if(a[i]<secondmini && a[i]!=mini){
                    secondmini=a[i];
                }
            }
            return new int[]{secondmaxi,secondmini};
        }
}
