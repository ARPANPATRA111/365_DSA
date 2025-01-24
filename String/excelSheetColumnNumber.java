/*LeetCode link:- https://leetcode.com/problems/excel-sheet-column-number/description/ */

public class excelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }
    
    public static void main(String[] args) {
        String columnTitle = "ABC";
        System.out.println(titleToNumber(columnTitle));
    }
}
