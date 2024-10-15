/*
 * 
 */

package easy;

import static util.DebugHelper.debugPrint;
import static util.DebugHelper.printValue;
import static util.DebugHelper.printPair;

public class TransposeMatrix {
    
    public int[][] run(int[][] matrix) {
        if (matrix.length == 0 )
            throw new IllegalArgumentException("Invalid Matrix Dimension");

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];
        debugPrint(matrix);

        printValue("rows", rows);
        printValue("cols", cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        debugPrint(transpose);
        return transpose;
    }
}