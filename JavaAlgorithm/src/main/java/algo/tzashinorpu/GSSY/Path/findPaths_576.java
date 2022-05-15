package algo.tzashinorpu.GSSY.Path;


public class findPaths_576 {
    // dp[i][j]:i位置移动j步出界的数量
    // p=i*n+j -> i=(p-j)/n j=p-i*n
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int MOD = 1000000007;
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] dp = new int[m * n][maxMove + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    init(i, j, n, maxMove, dp);
                if (j == 0)
                    init(i, j, n, maxMove, dp);
                if (i == m - 1)
                    init(i, j, n, maxMove, dp);
                if (j == n - 1)
                    init(i, j, n, maxMove, dp);
            }
        }
        for (int i = 0; i < m * n; i++) {
            System.out.printf("{x=%d,y=%d}\n", i / n, i % n);
            for (int j = 1; j <= maxMove; j++) {
                System.out.printf("    moves=%d,steps=%d\n", j, dp[i][j]);
            }
        }
        for (int i = 1; i <= maxMove; i++) {
            for (int p = 0; p < m * n; p++) {
                int x = parseIdx(p, n)[0];
                int y = parseIdx(p, n)[1];
                for (int j = 0; j < 4; j++) {
                    int nx = x + dirs[j][0];
                    int ny = y + dirs[j][1];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                        dp[p][i] += dp[gexIdx(nx, ny, n)][i - 1];
                        dp[p][i] %= MOD;
                    }
                }
            }
        }
        return dp[gexIdx(startRow, startColumn, n)][maxMove];
    }

    private void init(int i, int j, int cols, int maxMove, int[][] dp) {
        int point = gexIdx(i, j, cols);
        for (int k = 1; k <= maxMove; k++) {
            dp[point][k]++;
        }
    }

    private int gexIdx(int nx, int ny, int cols) {
        return nx * cols + ny;
    }

    private int[] parseIdx(int p, int cols) {
        return new int[]{p / cols, p % cols};
    }
}
