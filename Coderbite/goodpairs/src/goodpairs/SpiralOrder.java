package goodpairs;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>(m * n);

        int top = 0;
        int left = 0;

        for (int rows = m, cols = n; rows >= 1 && cols >= 1; rows -= 2, cols -= 2) {
            traverse(matrix, top++, left++, rows, cols, result);
        }
        return result;
    }

    private void traverse(int[][] matrix, int top, int left, int rows, int cols, List<Integer> result) {
        int bottom = top + rows;
        int right = left + cols;

        for (int i = left; i < right; i++) {
            result.add(matrix[top][i]);
            if (rows == 1) return;
        }

        for (int i = top + 1; i < bottom; i++) {
            result.add(matrix[i][right - 1]);
            if (cols == 1) return;
        }

        for (int i = right - 2; i >= left; i--) {
            result.add(matrix[bottom - 1][i]);
            if (rows == 2) return;
        }

        for (int i = bottom - 2; i > top; i--) {
            result.add(matrix[i][left]);
        }
    }
}
