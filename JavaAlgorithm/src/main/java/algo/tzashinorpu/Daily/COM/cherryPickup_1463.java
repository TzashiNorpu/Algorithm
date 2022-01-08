package algo.tzashinorpu.Daily.COM;

public class cherryPickup_1463 {
    public int cherryPickup(int[][] grid) {
        // dp[i][j1][j2]
        // dp[i-1][j1'][j2'] j1' -> {j1-1,j1,j1+1}
        // dp[i][j1][j2] = max(dp[i-1][j1'][j2']+value[i][j1][j2])
        // value[i][j1][j2] = j1!=j2?grid[i][j1]+grid[i][j2]:grid[i][j1]
        int rows = grid.length;
        int cols = grid[0].length;
        int[][][] dp = new int[rows][cols][cols];
        int res = 0;
        dp[0][0][0] = grid[0][0];
        dp[0][0][cols - 1] = grid[0][cols - 1] + grid[0][0];
        for (int i = 1; i < rows; i++) {
            int temp = 0;
            for (int j1 = 0; j1 < cols; j1++) {
                for (int j2 = 0; j2 < cols; j2++) {
                    for (int m = j1 - 1; m <= j1 + 1; m++) {
                        for (int n = j2 - 1; n <= j2 + 1; n++) {
                            if (m < 0 || m >= cols || n < 0 || n >= cols || dp[i - 1][m][n] == 0) {
                                continue;
                            }
                            temp = Math.max(dp[i - 1][m][n], temp);
                        }
                    }
                    dp[i][j1][j2] = temp + (j1 != j2 ? grid[i][j1] + grid[i][j2] : grid[i][j1]);
                    res = Math.max(res, dp[i][j1][j2]);
                }
            }
        }
        return res;
    }
}
