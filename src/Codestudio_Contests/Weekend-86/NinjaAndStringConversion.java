public class NinjaAndStringConversion {
    static String ninjaAndStringConversion(int n, String str) {
        // if lowercase, replace with next letter
        // if uppercase, replace with prev letter

        String s = "";
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            char newch;
            if (Character.isUpperCase(ch)) {
                if (ch != 'A') {
                    newch = (char) (ch - 1);  // Decrementing the char value
                } else {
                    newch = 'Z';  // Wrap around to 'Z' from 'A'
                }
            } else {
                if (ch != 'z') {
                    newch = (char) (ch + 1);  // Incrementing the char value
                } else {
                    newch = 'a';  // Wrap around to 'a' from 'z'
                }
            }
            s = s + newch;  // Concatenate the new character to the result string
        }
        return s;  // Return the result string
    }
}
