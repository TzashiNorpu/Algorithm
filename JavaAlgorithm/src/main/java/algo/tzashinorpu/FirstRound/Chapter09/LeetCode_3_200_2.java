package algo.tzashinorpu.FirstRound.Chapter09;

public class LeetCode_3_200_2 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dfs(int r, int c, char[][] grid) {
        if (invalid(r, c, grid)) {
            return;
        }
        if (grid[r][c] != '1') {
            return;
        }
        grid[r][c] = 'B';
        dfs(r + 1, c, grid);
        dfs(r - 1, c, grid);
        dfs(r, c + 1, grid);
        dfs(r, c - 1, grid);
    }

    private boolean invalid(int r, int c, char[][] grid) {
        return r < 0 || r >= grid.length || c < 0 || c >= grid[0].length;
    }
}
