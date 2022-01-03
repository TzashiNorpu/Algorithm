package algo.tzashinorpu.SecondRound.Chapter12;

public class maxProfit_714 {
    public int maxProfitDp(int[] prices, int fee) {
        // have[i] i天持有一股时的最大收益
        // none[i] i天不持股时的最大收益
        // have[i] = max(have[i-1],none[i-1]-prices[i])
        // none[i] = max(none[i-1],have[i-1]+prices[i]-fee)
        int length = prices.length;
        int[] have = new int[length];
        int[] none = new int[length];
        have[0] = -prices[0];
        none[0] = 0;
        for (int i = 1; i < length; i++) {
            have[i] = Math.max(have[i - 1], none[i - 1] - prices[i]);
            none[i] = Math.max(none[i - 1], have[i - 1] + prices[i] - fee);
        }
        return none[length - 1];
    }

    public int maxProfit(int[] prices, int fee) {
        // 1, 3, 2, 8, 20, 9
        int cost = prices[0] + fee;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > cost) {
                // 1->8  8->20  -> 1->20  只收一次手续费
                profit += prices[i] - cost;
                cost = prices[i]; // 只收一次手续费
            } else if (prices[i] + fee < cost) {
                cost = prices[i] + fee;
            }
        }
        return profit;
    }
}
