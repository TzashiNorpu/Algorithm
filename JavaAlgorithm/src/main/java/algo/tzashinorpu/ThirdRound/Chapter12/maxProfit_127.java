package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxProfit_127 {
    public int maxProfit(int[] prices) {
        // 某一天买入  不同日子卖出  -> 一次交易
        int len = prices.length;
        int max = 0;
        int[] dp = new int[len];
        int min = prices[0];
        for (int i = 1; i < len; i++) {
            min = Math.min(min, prices[i]);
            dp[i] = prices[i] - min;
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
