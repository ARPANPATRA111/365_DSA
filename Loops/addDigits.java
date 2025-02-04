/*LeetCode link:- https://leetcode.com/problems/add-digits/ */

package Loops;

public class addDigits {
    public static int addDigit(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10; // Extract the last digit
                num /= 10;       // Remove the last digit
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigit(num));
    }
}
