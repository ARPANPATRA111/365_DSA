import java.util.Arrays;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) {
        //     return false;
        // }
        // int[] count = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }
        // for (int i = 0; i < 26; i++) {
        //     if (count[i] != 0) {
        //         return false;
        //     }
        // }
        // return true;

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        if (Arrays.equals(sc, tc)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "nigamnagar", t = "nagarnigam";
        System.out.println(isAnagram(s, t));
    }
}
