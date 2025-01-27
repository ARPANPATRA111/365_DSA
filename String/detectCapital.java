/*LeetCode link:- https://leetcode.com/problems/detect-capital/description/ */

public class detectCapital {
    public static boolean detectCapitalUse(String s) {
        return s.equals(s.toUpperCase()) || 
               s.equals(s.toLowerCase()) || 
               Character.isUpperCase(s.charAt(0)) &&
               s.substring(1).equals(s.substring(1).toLowerCase());
    }

    public static void main(String[] args) {
        String s = "UganDa";
        System.out.println(detectCapitalUse(s));
    }
}
