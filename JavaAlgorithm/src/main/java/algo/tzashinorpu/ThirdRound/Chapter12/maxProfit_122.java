package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxProfit_122 {
    public int maxProfit(int[] prices) {
        // 最多持有一股
        int max = 0;
        int len = prices.length;
        for (int i = 1; i < len; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                max += diff;
            }
        }
        return max;
    }
}
