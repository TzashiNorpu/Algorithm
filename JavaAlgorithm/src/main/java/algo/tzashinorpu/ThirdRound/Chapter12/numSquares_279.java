package algo.tzashinorpu.ThirdRound.Chapter12;

public class numSquares_279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            // 15 -> 9+4+1+1  dp[1]+dp[14]|dp[4]+dp[11]|dp[9]+dp[6]
            // 1->1 4->1 6->dp[4]+1+1 9->1 11->dp[9]+1+1 14->dp[9]+dp[4]+1
            for (int j = 1; i - j * j >= 0; j++) {
                // +1是 j*j 的个数:dp[j*j]=1
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
