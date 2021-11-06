package algo.tzashinorpu.SecondRound.Chapter09;

public class numIslands_200 {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dfs(int i, int j, char[][] grid) {
        if (isInvalid(i, j, grid)) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 'X';
        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);
    }

    private boolean isInvalid(int i, int j, char[][] grid) {
        return i < 0 || i >= grid.length || j < 0 || j >= grid[0].length;
    }
}
