package algo.tzashinorpu.SecondRound.Chapter12;

public class maxProfit_123 {
    public int maxProfitDp(int[] prices) {
        // 最多两笔交易
        // 0:买入 1:完成一笔交易  2:一笔交易+买入  3:两笔交易
        int length = prices.length;
        int[][] dp = new int[4][length];
        dp[0][0] = -prices[0];
        dp[1][0] = 0;
        dp[2][0] = -prices[0];
        dp[3][0] = 0;
        for (int i = 1; i < length; i++) {
//            for (int j = 0; j < 4; j++) {
            // 3, 3, 5, 0, 0, 3, 1, 4
            dp[0][i] = Math.max(-prices[i], dp[0][i - 1]);
            dp[1][i] = Math.max(prices[i] + dp[0][i], dp[1][i - 1]);
            dp[2][i] = Math.max(dp[1][i] - prices[i], dp[2][i - 1]);
            dp[3][i] = Math.max(dp[2][i] + prices[i], dp[3][i - 1]);
//            }
        }
        return dp[3][length - 1];
    }

    public int maxProfitGreedy(int[] prices) {
        int buy1 = -prices[0];
        int sell1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;
        int length = prices.length;
        for (int i = 1; i < length; i++) {
            // 3, 3, 5, 0, 0, 3, 1, 4
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}
