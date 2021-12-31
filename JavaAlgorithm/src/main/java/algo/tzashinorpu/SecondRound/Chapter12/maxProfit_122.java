package algo.tzashinorpu.SecondRound.Chapter12;

public class maxProfit_122 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int p = prices[i] - prices[i - 1];
            max += Math.max(p, 0);
        }
        return max;
    }
}
