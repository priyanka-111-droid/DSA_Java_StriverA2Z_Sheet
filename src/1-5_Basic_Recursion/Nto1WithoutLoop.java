public class Nto1WithoutLoop
{
    void printNos(int N) {
        System.out.print(N+" ");
        if(N<=1){
            return;
        }
        printNos(N-1);
    }
}