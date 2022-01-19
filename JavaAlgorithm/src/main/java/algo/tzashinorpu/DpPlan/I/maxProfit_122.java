package algo.tzashinorpu.DpPlan.I;

public class maxProfit_122 {
    public int maxProfit(int[] prices) {
        // 7,1,5,6,4 -> 5
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }
}
