import java.util.*;
public class checkArmstrong {

    public static void main(String[] args) {
        // Write your code here
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int temp=n,k=0,s=0;
        while(n!=0){
            k++;
            n/=10;
        }
        n=temp;
        while(n!=0){
            int r=n%10;
            s=s+(int)Math.pow(r,k);
            n/=10;
        }
        System.out.println(s==temp);
    }
}
