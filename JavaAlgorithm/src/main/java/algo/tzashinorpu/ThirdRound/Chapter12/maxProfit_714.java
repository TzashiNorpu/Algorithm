package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxProfit_714 {
    public int maxProfit_1(int[] prices, int fee) {
        // 1,4,3,8  fee=2
        // 1,4,2,8  fee=2
        int cost = prices[0] + fee;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > cost) {
                profit += prices[i] - cost;
                cost = prices[i];
            } else {
                cost = Math.min(cost, prices[i] + fee);
            }
        }
        return profit;
    }

    public int maxProfit_2(int[] prices, int fee) {
        // 1,4,3,8  fee=2
        // 1,4,2,8  fee=2
        int len = prices.length;
        int[] have = new int[len];
        int[] none = new int[len];
        have[0] = -prices[0];
        none[0] = 0;
        for (int i = 1; i < len; i++) {
            have[i] = Math.max(have[i - 1], none[i - 1] - prices[i]);
            none[i] = Math.max(none[i - 1], have[i - 1] + prices[i] - fee);
        }
        return none[len - 1];
    }
}
