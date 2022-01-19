package algo.tzashinorpu.DpPlan.I;

public class maxProfit_121 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[] dp = new int[length];
        int min = prices[0];
        dp[0] = 0;
        for (int i = 1; i < length; i++) {
            min = Math.min(min, prices[i]);
            dp[i] = Math.max(prices[i] - min, dp[i - 1]);
        }
        return dp[length - 1];
    }
}
