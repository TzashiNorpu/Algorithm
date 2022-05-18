package algo.tzashinorpu.SpecialSubject.Top;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int INF = 101;
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0, x = 0, y = 0, d = 0; i < rows * cols; i++) {
            res.add(matrix[x][y]);
            matrix[x][y] = INF;
            int nx = x + dirs[d][0];
            int ny = y + dirs[d][1];
            if (nx < 0 || nx >= rows || ny < 0 || ny >= cols || matrix[nx][ny] == INF) {
                d = (d + 1) % 4;
                nx = x + dirs[d][0];
                ny = y + dirs[d][1];
            }
            x = nx;
            y = ny;
        }
        return res;
    }
}
