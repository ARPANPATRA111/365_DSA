/*LeetCode link:- https://leetcode.com/problems/length-of-last-word/description/ */

public class lengthOfLastWord {
    public static int lengthOfLastWordd(String s) {
        int num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                while (s.charAt(i) != ' ') {
                    num++;
                    i--;
                    if (i < 0) {
                        return num;
                    }
                }
                return num;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWordd(s));
    }
}
