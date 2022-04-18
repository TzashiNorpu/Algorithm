package algo.tzashinorpu.ThirdRound.Chapter09;

public class numIslands_200 {
    public int numIslands(char[][] grid) {
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    _dfs(i, j, grid, dirs);
                }
            }
        }
        return cnt;
    }

    private void _dfs(int i, int j, char[][] grid, int[][] dirs) {
        if (invalid(i, j, grid)) {
            return;
        }
        if (grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 'x';
        for (int k = 0; k < 4; k++) {
            _dfs(i + dirs[k][0], j + dirs[k][1], grid, dirs);
        }
    }

    private boolean invalid(int i, int j, char[][] grid) {
        return i < 0 || i >= grid.length || j < 0 || j >= grid[0].length;
    }
}
