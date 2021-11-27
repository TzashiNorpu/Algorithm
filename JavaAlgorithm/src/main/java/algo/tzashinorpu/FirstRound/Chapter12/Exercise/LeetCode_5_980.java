package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_980 {
    private int validPathCount = 0;

    public int uniquePathsIII(int[][] grid) {
        /*
        1,0,0, 0
        0,0,0, 0
        0,0,2,-1
        */
        // 每一个0都要通过一次，但是不能重复通过
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        int step = 0;
        int[] dx = {-1, 0, 0, 1};
        int[] dy = {0, -1, 1, 0};
        int zeroCount = 0;
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    zeroCount++;
                }
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        dfs(startX, startY, rows, cols, dx, dy, visited, grid, step, zeroCount);
        return this.validPathCount;
    }

    private void dfs(int i, int j, int rows, int cols, int[] dx, int[] dy, int[][] visited, int[][] grid, int step, int zeroCount) {
        if (invalidPos(i, rows, j, cols)) {
            return;
        }
        if (grid[i][j] == -1) {
            return;
        }
        if (visited[i][j] == 1) {
            return;
        }
        if (grid[i][j] == 2) {
            if (step - 1 == zeroCount) {
                this.validPathCount++;
            }
            return;
        }
        visited[i][j] = 1;
        for (int k = 0; k < dx.length; k++) {
            dfs(i + dx[k], j + dy[k], rows, cols, dx, dy, visited, grid, step + 1, zeroCount);
        }
        visited[i][j] = 0;
    }

    private boolean invalidPos(int i, int rows, int j, int cols) {
        return i < 0 || i >= rows || j < 0 || j >= cols;
    }
}
