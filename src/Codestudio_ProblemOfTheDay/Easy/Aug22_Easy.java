import java.util.* ;
import java.io.*;
public class Aug22_Easy {
    public static int boringFactorials(int n, int p)
    {
        int product=1;
        for(int i=n;i>=1;i--){
            product=product*i %p;
        }
        return product % p;
    }
}
