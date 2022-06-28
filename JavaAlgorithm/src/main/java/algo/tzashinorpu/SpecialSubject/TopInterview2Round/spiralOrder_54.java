package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        // 右下左上
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int rows = matrix.length;
        int cols = matrix[0].length;
        int dir_index = 0;
        int VISITED = Integer.MAX_VALUE;
        for (int i = 0, x = 0, y = 0; i < rows * cols; i++) {
            res.add(matrix[x][y]);
            matrix[x][y] = VISITED;
            int nx = x + dirs[dir_index][0];
            int ny = y + dirs[dir_index][1];
            if (nx < 0 || nx >= rows || ny < 0 || ny >= cols || matrix[nx][ny] == VISITED) {
                dir_index = (dir_index + 1) % 4;
                nx = x + dirs[dir_index][0];
                ny = y + dirs[dir_index][1];
            }
            x = nx;
            y = ny;
        }
        return res;
    }
}
