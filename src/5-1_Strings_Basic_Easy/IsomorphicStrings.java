import java.util.HashMap;
public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false; //not poss if length different
        }
        HashMap<Character,Character> firstToSecond = new HashMap<>();
        HashMap<Character,Character> secondToFirst = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char fChar = str1.charAt(i);
            char sChar = str2.charAt(i);

            //mapping from str1 to str2
            if (firstToSecond.containsKey(fChar)) {
                if (firstToSecond.get(fChar) != sChar) {
                    return false; // Conflict in the mapping.
                }
            } else {
                firstToSecond.put(fChar, sChar);
            }

            //mapping from str2 to str1
            if (secondToFirst.containsKey(sChar)) {
                if (secondToFirst.get(sChar) != fChar) {
                    return false; // Conflict in the mapping.
                }
            } else {
                secondToFirst.put(sChar, fChar);
            }
        }
        return true;//no conflict,isomorphic

    }
}