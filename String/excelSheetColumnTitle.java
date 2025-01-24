/*LeetCode link:- https://leetcode.com/problems/excel-sheet-column-title/ */

public class excelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        String columnTitle = "";
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-based indexing
            int remainder = columnNumber % 26;
            char letter = (char) (remainder + 'A');
            columnTitle = letter + columnTitle;
            columnNumber /= 26;
        }
        return columnTitle;
    }
    public static void main(String[] args) {
        String columnTitle = convertToTitle(700);
        System.out.println("Column Title: " + columnTitle);
    }
}
