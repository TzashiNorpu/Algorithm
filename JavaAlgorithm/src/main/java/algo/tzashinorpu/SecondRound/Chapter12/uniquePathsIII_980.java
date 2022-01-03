package algo.tzashinorpu.SecondRound.Chapter12;

public class uniquePathsIII_980 {
    public int uniquePathsIII(int[][] grid) {
        int startX = -1;
        int startY = -1;
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
                if (grid[i][j] == 0) {
                    count++;
                }
            }
        }
        return dfs(grid, startX, startY, count);
    }

    private int dfs(int[][] grid, int x, int y, int count) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
            return 0;
        }
        if (grid[x][y] == -1 || grid[x][y] == 3) {
            return 0;
        }
        if (count < -1) {
            return 0;
        }
        if (grid[x][y] == 2) {
            if (count == -1) {
                return 1;
            } else {
                return 0;
            }
        }
        grid[x][y] = 3;
        int paths = dfs(grid, x + 1, y, count - 1) +
                dfs(grid, x, y + 1, count - 1) +
                dfs(grid, x, y - 1, count - 1) +
                dfs(grid, x - 1, y, count - 1);
        grid[x][y] = 0;
        return paths;
    }
}
