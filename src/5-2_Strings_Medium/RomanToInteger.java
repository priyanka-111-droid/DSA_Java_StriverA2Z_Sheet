import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        hmap.put('I',1);
        hmap.put('V',5);
        hmap.put('X',10);
        hmap.put('L',50);
        hmap.put('C',100);
        hmap.put('D',500);
        hmap.put('M',1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = hmap.get(currentChar);

            // If the current value is less than the previous value, we subtract
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }
}
