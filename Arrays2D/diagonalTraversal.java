/*LeetCode link:- https://leetcode.com/problems/diagonal-traverse/ */

package Arrays2D;

public class diagonalTraversal {
    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length; 
        int n = mat[0].length; 
        int[] result = new int[m * n];
        int row = 0, col = 0;
        
        boolean goingUp = true;
        int index = 0;
        
        while (index < m * n) {
            result[index] = mat[row][col];
            index++;
            
            if (goingUp) {
                if (col == n-1) { 
                    row++;
                    goingUp = false;
                } else if (row == 0) {
                    col++;
                    goingUp = false;
                } else {      
                    row--;
                    col++;
                }
            }
            else {
                if (row == m-1) { 
                    col++;
                    goingUp = true;
                } else if (col == 0) {
                    row++;
                    goingUp = true;
                } else {    
                    row++;
                    col--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};    
        System.out.println(java.util.Arrays.toString(findDiagonalOrder(mat)));
    }
}
