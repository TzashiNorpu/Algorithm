package algo.tzashinorpu.FirstRound.Chapter09;

public class LeetCode_3_200_1 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (notInGrid(grid, r, c)) {
            return;
        }
        if (grid[r][c] != '1') {
            return;
        }
        grid[r][c] = '2';
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }

    private boolean notInGrid(char[][] grid, int r, int c) {
        int row = grid.length;
        int col = grid[0].length;
        return r < 0 || r >= row || c < 0 || c >= col;
    }
}
