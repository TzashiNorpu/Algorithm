package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_221_1 {
    public int maximalSquare(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int w = 0;
        int[][] dp = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int temp = matrix[i][0] - '0';
            dp[i][0] = temp;
            w = Math.max(temp, w);
        }
        for (int i = 0; i < cols; i++) {
            int temp = matrix[0][i] - '0';
            dp[0][i] = temp;
            w = Math.max(temp, w);
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = matrix[i][j] == '0' ? 0 : Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                w = Math.max(w, dp[i][j]);
            }
        }
        return w * w;
    }
}
