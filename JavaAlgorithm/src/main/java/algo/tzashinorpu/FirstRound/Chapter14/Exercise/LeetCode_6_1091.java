package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

import java.util.LinkedList;

public class LeetCode_6_1091 {
    private int res = Integer.MAX_VALUE;

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
       /* backTrack(0, 0, dx, dy, 1, visited, grid, this.res);
        return this.res == Integer.MAX_VALUE ? -1 : this.res;*/
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(0);
        visited[0][0] = true;
        if (grid[0][0] != 0 || grid[rows - 1][cols - 1] != 0) {
            return -1;
        }
        int len = bfs(stack, dx, dy, visited, grid, 0);
        return len;
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
    private int bfs(LinkedList<Integer> stack, int[] dx, int[] dy, boolean[][] visited, int[][] grid, int len) {
        int rows = grid.length;
        int cols = grid[0].length;
        while (!stack.isEmpty()) {
            int size = stack.size();
            len++;
            for (int k = 0; k < size; k++) {
                Integer pos = stack.pollFirst();
                int x = pos / rows;
                int y = pos % cols;
                if (x == rows - 1 && y == cols - 1) {
                    return len;
                }
                for (int i = 0; i < 8; i++) {
                    int x1 = x + dx[i];
                    int y1 = y + dy[i];
                    if (!(inValidPos(x1, y1, grid))) {
                        if (grid[x1][y1] == 0 && !visited[x1][y1])
                            stack.offerLast(x1 * cols + y1);
                        visited[x1][y1] = true;
                    }
                }
            }
        }
        return visited[rows - 1][cols - 1] ? len : -1;
    }
}
