package algo.tzashinorpu.SecondRound.Chapter12;

public class uniquePathsWithObstacles_063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        dp[rows - 1][cols - 1] = obstacleGrid[rows - 1][cols - 1] == 1 ? 0 : 1;
        for (int i = rows - 2; i >= 0; i--) {
            dp[i][cols - 1] = obstacleGrid[i][cols - 1] != 1 ? dp[i + 1][cols - 1] : 0;
        }
        for (int i = cols - 2; i >= 0; i--) {
            dp[rows - 1][i] = obstacleGrid[rows - 1][i] != 1 ? dp[rows - 1][i + 1] : 0;
        }
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = cols - 2; j >= 0; j--) {
                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : (dp[i + 1][j] + dp[i][j + 1]);
            }
        }
        return dp[0][0];
    }
}
