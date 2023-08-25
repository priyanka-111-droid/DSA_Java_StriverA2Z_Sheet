public class PlanetDivision{
    //logic:brute force,division of odd numbers and even numbers
    static int[] planetDivision(int n) {
        // Write your code here.
        int thor,loki;
        if(n%2!=0){
            //odd
            thor = (n+1)/2;
            loki = n-thor;
        }else{
            thor = n/2;
            loki = thor;
        }
        return new int[]{thor,loki};
    }
}