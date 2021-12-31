package algo.tzashinorpu.SecondRound.Chapter12;

public class maxProfit_123 {
    public int maxProfit(int[] prices) {
        // 最多两笔交易
        // 0:买入 1:完成一笔交易  2:一笔交易+买入  3:两笔交易
        int length = prices.length;
        int[][] dp = new int[length][4];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = -prices[0];
        dp[0][3] = 0;
        int max = dp[0][3];
        for (int i = 1; i < length; i++) {
//            for (int j = 0; j < 4; j++) {
            dp[i][0] = Math.max(-prices[i], dp[i - 1][0]);
            dp[i][1] = prices[i] + dp[i][0];
            dp[i][2] = dp[i][1] - prices[i];
            dp[i][3] = dp[i][2] + prices[i];
            max = Math.max(dp[i][3], max);
//            }
        }
        return max;
    }
}
