package algo.tzashinorpu.SecondRound.Chapter10;

public class maxProfit_122 {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int profit = 0;
        for (int i = 0; i < length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
