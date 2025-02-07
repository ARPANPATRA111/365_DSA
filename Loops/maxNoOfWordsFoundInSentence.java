/*LeetCode link:- https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/ */

package Loops;

public class maxNoOfWordsFoundInSentence {
    public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for (String i : sentences) {
            int wordCount = i.split(" ").length;
            maxWords = Math.max(maxWords, wordCount);
        }
        return maxWords;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
