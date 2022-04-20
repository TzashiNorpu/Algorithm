package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxProfit_309 {
    public int maxProfit(int[] prices) {
        // sell then frozen
        //dp[i][0]:i天持一股
        //dp[i][1]:i天不持股 当天卖出
        //dp[i][2]:i天不持股 非当天卖出
        int len = prices.length;
        int[][] dp = new int[len][3];
        dp[0][0] = prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] + prices[i]);
            dp[i][1] = dp[i][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
        }
        return Math.max(dp[len - 1][2], dp[len - 1][1]);
    }
}
