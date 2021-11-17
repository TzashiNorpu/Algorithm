package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_123 {
    public int maxProfit(int[] prices) {
        int fir = 0;
        if (prices.length == 1) {
            return fir;
        }
        int sec = prices[1] - prices[0] > 0 ? prices[1] - prices[0] : 0;
        int min = Math.min(prices[0], prices[1]);
        int minIndex = prices[0] < prices[1] ? 0 : 1;
        for (int i = 2; i < prices.length; i++) {
            int t = prices[i] - min;
            if (t > fir) {
                sec = fir;
                fir = t;
                min = prices[i + 1];
                minIndex = i + 1;
            }
            if (t > sec && t <= fir) {
                sec = t;
                min = prices[i + 1];
                minIndex = i + 1;
            }
        }

        return minIndex == 0 ? fir : fir + sec;
    }
}
