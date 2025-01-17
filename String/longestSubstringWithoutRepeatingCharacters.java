/*LeetCode link:- https://leetcode.com/problems/longest-substring-without-repeating-characters/ */

public class longestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) { 
        int[] lastIndex = new int[128]; 
        for (int i = 0; i < 128; i++) 
        { 
            lastIndex[i] = -1;
        } 
        int maxLength = 0; 
        int start = 0; 
        for (int end = 0; end < s.length(); end++) 
        { 
            char currentChar = s.charAt(end); 
            if (lastIndex[currentChar] >= start) 
            { 
                start = lastIndex[currentChar] + 1; 
            } 
            lastIndex[currentChar] = end; 
            maxLength = Math.max(maxLength, end - start + 1); 
        }
        return maxLength; 
    }        
    
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
