package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

public class LeetCode_6_1091 {
    private int res = Integer.MAX_VALUE;

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        backTrack(0, 0, dx, dy, 1, visited, grid, this.res);
        return this.res == Integer.MAX_VALUE ? -1 : this.res;
    }

    // dfs 超时
    private void backTrack(int x, int y, int[] dx, int[] dy, int len, boolean[][] visited, int[][] grid, int res) {
        if (inValidPos(x, y, grid)) {
            return;
        }
        if (grid[x][y] != 0) {
            return;
        }
        if (visited[x][y]) {
            return;
        }
        if (x == grid.length - 1 && y == grid[0].length - 1) {
            this.res = Math.min(this.res, len);
            return;
        }
        for (int i = 0; i < 8; i++) {
            visited[x][y] = true;
            backTrack(x + dx[i], y + dy[i], dx, dy, len + 1, visited, grid, res);
            visited[x][y] = false;
        }
    }

    private boolean inValidPos(int x, int y, int[][] grid) {
        return x < 0 || x >= grid.length || y < 0 || y >= grid[0].length;
    }


//    bfs
}
