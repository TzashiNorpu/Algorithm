package algo.tzashinorpu.SecondRound.Chapter12;

public class maximalSquare_221 {
    public int maximalSquare(char[][] matrix) {
        //
        /*table               dp
        0   1   1   1   0     0   1   1   1   0
        1   1   1   1   0     1   1   2   2   0
        0   1   1   1   1  -> 0   1   2   3   1
        0   1   1   1   1     0   1   2   3   2
        0   0   1   1   1     0   0   1   2   2
        */
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        int w = 0;
        for (int i = 0; i < rows; i++) {
            dp[i][0] = matrix[i][0] - '0';
            w = Math.max(dp[i][0], w);
        }
        for (int i = 0; i < cols; i++) {
            dp[0][i] = matrix[0][i] - '0';
            w = Math.max(dp[0][i], w);
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    int min = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                    dp[i][j] = min + 1;
                    w = Math.max(dp[i][j], w);
                }
            }
        }
        return w * w;
    }
}
