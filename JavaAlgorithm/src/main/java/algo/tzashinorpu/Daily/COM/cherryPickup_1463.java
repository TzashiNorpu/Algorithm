package algo.tzashinorpu.Daily.COM;

import java.sql.Array;
import java.util.Arrays;

public class cherryPickup_1463 {
    public int cherryPickup(int[][] grid) {
        // dp[i][j1][j2]
        // dp[i-1][j1'][j2'] j1' -> {j1-1,j1,j1+1}
        // dp[i][j1][j2] = max(dp[i-1][j1'][j2']+value[i][j1][j2])
        // value[i][j1][j2] = j1!=j2?grid[i][j1]+grid[i][j2]:grid[i][j1]
        int rows = grid.length;
        int cols = grid[0].length;
        int INVALID = -1;
        int[][][] dp = new int[rows][cols][cols];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                Arrays.fill(dp[i][j], INVALID);
            }
        }
        int res = 0;
        dp[0][0][cols - 1] = grid[0][cols - 1] + grid[0][0];
        for (int i = 1; i < rows; i++) {
            // 3 r 4 l  <->  4 r 3 c
//            for (int j1 = 0; j1 < cols; j1++) {
            for (int j1 = 0; j1 <= Math.min(cols - 1, i); j1++) {
//                for (int j2 = 0; j2 < cols; j2++) {
                for (int j2 = cols - 1; j2 >= Math.max(0, cols - i - 1); j2--) {
                    int temp = INVALID;
                    for (int m = j1 - 1; m <= j1 + 1; m++) {
                        for (int n = j2 - 1; n <= j2 + 1; n++) {
                            if (m < 0 || m >= cols || n < 0 || n >= cols || dp[i - 1][m][n] == -1) {
                                continue;
                            }
                            dp[i][j1][j2] = Math.max(dp[i - 1][m][n] + (j1 != j2 ? grid[i][j1] + grid[i][j2] : grid[i][j1]), dp[i][j1][j2]);
                        }
                    }
                    res = Math.max(res, dp[i][j1][j2]);
                }
            }
        }
        return res;
    }
}
