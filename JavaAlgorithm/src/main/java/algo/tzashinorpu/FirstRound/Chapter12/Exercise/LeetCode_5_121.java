package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_121 {
    public int maxProfit(int[] prices) {
        int[] ints = new int[prices.length];
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            ints[i] = prices[i] - min;
            min = Math.min(min, prices[i]);
            maxProfit = Math.max(maxProfit, ints[i]);
        }
        return maxProfit;
    }
}
