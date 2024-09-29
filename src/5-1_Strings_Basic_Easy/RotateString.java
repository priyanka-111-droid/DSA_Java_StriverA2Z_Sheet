/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
 */
public class RotateString {
    public boolean rotateString(String s, String goal) {
        // Check if lengths match
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate s with itself
        String doubledS = s + s;

        // Check if goal is a substring of doubledS
        return doubledS.contains(goal);
    }
}
