package algo.tzashinorpu.GSSY.Path;

import java.util.Arrays;

public class minFallingPathSum_1289 {
    public int minFallingPathSum1(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        // o(n^3)  100^3=10^6
        int[][] dp = new int[rows][cols];
        System.arraycopy(grid[0], 0, dp[0], 0, cols);
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < cols; k++) {
                    if (j == k) continue;
                    min = Math.min(min, dp[i - 1][k]);
                }
                dp[i][j] = min + grid[i][j];
            }
        }
        return Arrays.stream(dp[rows - 1]).min().getAsInt();
    }

    public int minFallingPathSum2(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        // o(n^2)
        int[][] dp = new int[rows][cols];
        // 最小索引
        int minCIndex = -1;
        // 次小索引
        int secMinCIndex = -1;

        for (int i = 0; i < cols; i++) {
            int val = grid[0][i];
            dp[0][i] = val;
            if (val < (minCIndex == -1 ? Integer.MAX_VALUE : dp[0][minCIndex])) {
                secMinCIndex = minCIndex;
                minCIndex = i;
            } else if (val < (secMinCIndex == -1 ? Integer.MAX_VALUE : dp[0][secMinCIndex])) {
                secMinCIndex = i;
            }
        }
        for (int i = 1; i < rows; i++) {
            int cIndex = -1;
            int secCIndex = -1;
            for (int j = 0; j < cols; j++) {
                if (j == minCIndex) dp[i][j] = dp[i - 1][secMinCIndex] + grid[i][j];
                else dp[i][j] = dp[i - 1][minCIndex] + grid[i][j];
                int val = dp[i][j];
                if (val < (cIndex == -1 ? Integer.MAX_VALUE : dp[i][cIndex])) {
                    secCIndex = cIndex;
                    cIndex = j;
                } else if (val < (secCIndex == -1 ? Integer.MAX_VALUE : dp[i][secCIndex])) {
                    secCIndex = j;
                }
            }
            minCIndex = cIndex;
            secMinCIndex = secCIndex;
        }
        return Arrays.stream(dp[rows - 1]).min().getAsInt();
    }
}
