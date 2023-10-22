/*
Way 1 - Sets
Way 2 - HashMap(used here)
Way 3 - DP
*/
import java.util.HashMap;
public class MoreSubsequences{
    public static int countSub(String s) {
        HashMap<Character,
                Integer> map = new HashMap<Character,
                Integer>();

        // Iterate from 0 to s.length()
        for(int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i), -1); //init count of all char to -1
        }

        int allCount = 0;
        int levelCount = 0;

        // Iterate from 0 to s.length()
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);

            // Check if i equal to 0
            if(i==0)
            {
                allCount = 1;
                map.put(c,1);
                levelCount = 1;
                continue;
            }

            // Replace levelCount with
            // allCount + 1
            levelCount = allCount + 1;

            // If map is less than 0,char is new
            if(map.get(c)<0)
            {
                allCount = allCount + levelCount;
            }
            else
            {
                allCount = allCount + levelCount - map.get(c);
            }
            map.put(c,levelCount);
        }

        // Return answer
        return allCount;

    }
    public static String moreSubsequence(int n, int m, String a, String b) {
        if(countSub(a)>=countSub(b)){
            return a;
        }else{
            return b;
        }
    }
}