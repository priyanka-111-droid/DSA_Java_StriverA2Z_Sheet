/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */
import java.util.HashMap;
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false; //not poss if length different
        }
        HashMap<Character,Character> firstToSecond = new HashMap<>();
        HashMap<Character,Character> secondToFirst = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char fChar = s.charAt(i);
            char sChar = t.charAt(i);

            //mapping from first string to second string.
            if (firstToSecond.containsKey(fChar)) {
                if (firstToSecond.get(fChar) != sChar) {
                    return false; // Conflict in the mapping.
                }
            } else {
                firstToSecond.put(fChar, sChar);
            }

            //mapping from second string to first string
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