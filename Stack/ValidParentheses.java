/*LeetCode link:- https://leetcode.com/problems/valid-parentheses/ */

package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        System.out.println("Input: " + s1 + " | Output: " + isValid(s1)); // true

        String s2 = "()[]{}";
        System.out.println("Input: " + s2 + " | Output: " + isValid(s2)); // true

        String s3 = "(]";
        System.out.println("Input: " + s3 + " | Output: " + isValid(s3)); // false
    }
}
