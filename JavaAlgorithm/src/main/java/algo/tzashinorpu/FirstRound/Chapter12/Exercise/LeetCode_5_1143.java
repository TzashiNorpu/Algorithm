package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_1143 {
    public int longestCommonSubsequence(String text1, String text2) {
//          b s b i n i n m
//       j  0 0 0 0 0 0 0 0
//       m  0 0 0 0 0 0 0 1
//       j  0 0 0 0 0 0 0 1
//       k  0 0 0 0 0 0 0 1
//       b  1 1 1 1 1 1 1 1
//       k  1 1 1 1 1 1 1 1
//       j  1 1 1 1 1 1 1 1
//       k  1 1 1 1 1 1 1 1
//       v  1 1 1 1 1 1 1 1
        int rows = text1.length();
        int cols = text2.length();
        int[][] dp = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            char c1 = text1.charAt(i - 1);
            for (int j = 1; j <= cols; j++) {
                char c2 = text2.charAt(j - 1);
                dp[i][j] = (c1 == c2) ? (dp[i - 1][j - 1] + 1) : (Math.max(dp[i - 1][j], dp[i][j - 1]));
            }
        }
        return dp[rows][cols];
    }
}
