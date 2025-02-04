/*LeetCode link:- https://leetcode.com/problems/set-matrix-zeroes/description/ */

package Arrays2D;

public class setMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        
        // First pass to find zeros and mark rows and columns
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        
        // Second pass to set matrix cells to zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
