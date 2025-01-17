/*LeetCode link:- https://leetcode.com/problems/string-to-integer-atoi/description/ */

public class stringToInteger {
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        int sign = 1; // Default is positive
        int result = 0;

        // 1. Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) ==
        '-')) 
        {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Parse digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow before updating result
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        // 4. Apply sign and return
        return result * sign;
    }

    public static void main(String[] args) {
        String s = "42";
        System.out.println(myAtoi(s));
    }   
}
