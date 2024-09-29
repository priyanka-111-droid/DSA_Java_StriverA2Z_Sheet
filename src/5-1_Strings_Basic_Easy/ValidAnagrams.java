/*
Given two strings s and t, return true if t is an
anagram of s, and false otherwise(anagrams means if I rearrange letters of s, I get t)
 */
import java.util.*;
public class ValidAnagrams {
        public boolean isAnagram(String s, String t) {
            //if unequal length, cannot be anagrams.
            if(s.length()!=t.length()){
                return false;
            }
            HashMap<Character,Integer> hmap = new HashMap<>();
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                hmap.put(ch,hmap.getOrDefault(ch,0)+1);
            }
            //check if second string characters are in hmap.
            for(int i = 0;i<t.length();i++){
                char ch = t.charAt(i);
                if(!hmap.containsKey(ch)||hmap.get(ch)==0){
                    return false;
                }else{
                    hmap.put(ch,hmap.get(ch)-1);
                }
            }
            return true;
    }
}
