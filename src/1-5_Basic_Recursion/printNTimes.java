public class printNTimes {
    public static void printNtimes(int n){
        System.out.print("Coding Ninjas ");

        // Recursively calling printNtimes as long as 'n' > 1.
        if(n>1)
            printNtimes(n-1);
    }
}