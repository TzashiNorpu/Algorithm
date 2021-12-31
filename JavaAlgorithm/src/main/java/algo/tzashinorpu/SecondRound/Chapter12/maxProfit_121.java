package algo.tzashinorpu.SecondRound.Chapter12;

public class maxProfit_121 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[] dp = new int[length];
        dp[0] = 0;
        int minPrice = prices[0];
        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return dp[length - 1];
    }
}
