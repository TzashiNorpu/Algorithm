package algo.tzashinorpu.SpecialSubject.TwoDTraverse;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder_54 {
    public List<Integer> spiralOrder_1(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int upperBound = 0, bottomBound = rows - 1, leftBound = 0, rightBound = cols - 1;
        while (res.size() < rows * cols) {
            if (upperBound <= bottomBound) {
                // 按串得顺序进行
                // 在顶部从左向右遍历
                for (int j = leftBound; j <= rightBound; j++) {
                    res.add(matrix[upperBound][j]);
                }
                // 上边界下移
                upperBound++;
            }

            if (leftBound <= rightBound) {
                // 在右侧从上向下遍历
                for (int i = upperBound; i <= bottomBound; i++) {
                    res.add(matrix[i][rightBound]);
                }
                // 右边界左移
                rightBound--;
            }

            if (upperBound <= bottomBound) {
                // 在底部从右向左遍历
                for (int j = rightBound; j >= leftBound; j--) {
                    res.add(matrix[bottomBound][j]);
                }
                // 下边界上移
                bottomBound--;
            }

            if (leftBound <= rightBound) {
                // 在左侧从下向上遍历
                for (int i = bottomBound; i >= upperBound; i--) {
                    res.add(matrix[i][leftBound]);
                }
                // 左边界右移
                leftBound++;
            }
        }
        return res;
    }

    public List<Integer> spiralOrder_2(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        // 右->下->左->上
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int pos = 0;
        int VISITED = Integer.MAX_VALUE;
        for (int i = 0, x = 0, y = 0; i < rows * cols; i++) {
            res.add(matrix[x][y]);
            matrix[x][y] = VISITED;
            int nx = x + dirs[pos][0];
            int ny = y + dirs[pos][1];
            if (nx < 0 || nx >= rows || ny < 0 || ny >= cols || matrix[nx][ny] == VISITED) {
                pos = (pos + 1) % 4;
                nx = x + dirs[pos][0];
                ny = y + dirs[pos][1];
            }
            x = nx;
            y = ny;
        }
        return res;
    }
}
