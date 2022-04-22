package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxProfit_188 {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        int max = 0;
        if (len == 0) return max;
        // 第 i 天经过 x 次交易后手上有股票
        int[][] have = new int[len][k + 1];
        // 第 i 天经过 x 次交易后手上没有股票
        int[][] no = new int[len][k + 1];
        // init  i=0
        for (int i = 0; i < k + 1; i++) {
            // prices[0] 上进行 k 次交易后进行一次买入
            // have[0][0] 为 prices[0] 上进行 0 次交易后持有股票-可以买入一次[只买入不形成一次交易]
            have[0][i] = -prices[0];
            // prices[0] 上进行 k 次交易
            no[0][i] = 0;
        }
        // init k=0
        for (int i = 1; i < len; i++) {
            // prices[0...i] 上进行 0 次交易后进行一次买入->即截止当前的最小值
            have[i][0] = Math.max(have[i - 1][0], -prices[i]);
            // prices[0...i] 上进行 0 次交易
            no[i][0] = 0;
        }

        for (int i = 1; i < len; i++) {
            for (int j = 1; j < k + 1; j++) {
                have[i][j] = Math.max(have[i - 1][j], no[i - 1][j] - prices[i]);
                no[i][j] = Math.max(have[i - 1][j - 1] + prices[i], no[i - 1][j]);
                max = Math.max(no[i][j], max);
            }
        }
        return max;
    }
}
