/*LeetCode link:- https://leetcode.com/problems/roman-to-integer/ */

public class romanToInteger {
    public static int romanToInt(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            // Assign numerical values for Roman numeral characters
            switch (s.charAt(j)) {
                case 'M':
                    number = 1000;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'I':
                    number = 1;
                    break;
            }

            // Check if the current number is smaller than the previous one
            if (number < prev) {
                answer -= number; // Subtract the number
            } else {
                answer += number; // Add the number
            }

            // Update the previous number for the next iteration
            prev = number;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
