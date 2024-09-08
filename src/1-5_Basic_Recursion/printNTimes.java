class printNTimes {

    void printGfg(int N) {
        System.out.print("GFG"+" ");
        if(N<=1){
            return;
        }
        printGfg(N-1);
    }
}