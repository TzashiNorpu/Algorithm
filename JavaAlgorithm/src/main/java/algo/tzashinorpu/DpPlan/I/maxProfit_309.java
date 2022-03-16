package algo.tzashinorpu.DpPlan.I;

public class maxProfit_309 {
    // https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/solution/fei-zhuang-tai-ji-de-dpjiang-jie-chao-ji-tong-su-y/
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[][] dp = new int[length][3];
        // 关键是当天是否卖出
        // 对于每一天i，都有可能是三种状态：
        // 0.不持股且当天没卖出
        // 1.不持股且当天卖出了
        // 2.持股
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = -prices[0];
        for (int i = 1; i < length; i++) {
            // 当天未卖出
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            // 当天卖出
            dp[i][1] = dp[i - 1][2] + prices[i];
            // 持股
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][0] - prices[i]);
        }
        return Math.max(dp[length - 1][0], dp[length - 1][1]);
    }
}
