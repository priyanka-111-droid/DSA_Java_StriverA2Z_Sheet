class LargestOddNumberLeetcode{
    public String largestOddNumber(String num) {
        // Iterate through the characters in reverse order
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(num.charAt(i)) % 2 == 1) {
                return num.substring(0, i + 1);
                // Return the substring up to and including the odd digit
            }
        }
        return ""; // No odd integer substring found
    }
}