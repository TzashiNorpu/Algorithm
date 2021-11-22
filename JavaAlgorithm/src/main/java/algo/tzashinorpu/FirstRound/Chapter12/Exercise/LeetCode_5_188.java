package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import java.util.Arrays;

public class LeetCode_5_188 {
    public int maxProfit1(int k, int[] prices) {
        /*
         * have[i][j]表示第i天进行 j 笔交易, 并且当前手上持有一支股票, 这种情况下的最大利润. no[i][j] 表示第i天进行 j 笔交易,
         * 并且当前手上不持有股票, 这种情况下的最大利润.
         */
        int maxProfit = 0;
        int ILLEGALVALUE = Integer.MIN_VALUE / 2;
        int length = prices.length;
        int[][] have = new int[k + 1][length];
        int[][] no = new int[k + 1][length];
        // 默认一买一卖才算完整交易一次, 买入不算交易, 卖出才算一次交易
        have[0][0] = -prices[0];
        no[0][0] = 0;
        for (int i = 1; i < length; i++) {
            have[0][i] = ILLEGALVALUE;
            no[0][i] = ILLEGALVALUE;
        }
        /*
         * for (int i = 1; i <= k; i++) { have[i][0] = Math.max(have[i - 1][0],
         * prices[i]); no[i][0] = 0; }
         */
        for (int i = 1; i <= k; i++) {
            // 第 i 天 进行了 0 笔交易，即第 i 天买入，i 天之前未做过卖出
            have[i][0] = Math.max(have[i - 1][0], no[i - 1][0] - prices[i]);
            for (int j = 1; j < length; j++) {
                /*
                 * 考虑当前手上持有的股票是否是在第 i 次买入的。 如果是第 i 天买入的，那么在第 i-1 天时，我们手上不持有股票，对应状态
                 * sell[i−1][j]，并且需要扣除 prices[j] 的买入花费； 如果不是第 i 天买入的，那么在第 i−1 天时，我们手上持有股票，对应状态
                 * buy[i−1][j]
                 */
                have[i][j] = Math.max(have[i - 1][j], no[i - 1][j] - prices[j]);
                /*
                 * sell[i][j]，如果是第 i 天卖出的，那么在第 i−1 天时，我们手上持有股票，对应状态 buy[i−1][j−1]，并且需要增加
                 * prices[i] 的卖出收益； 如果不是第 i 天卖出的，那么在第 i-1 天时，我们手上不持有股票，对应状态 sell[i−1][j]
                 */
                no[i][j] = Math.max(no[i - 1][j], have[i - 1][j - 1] + prices[j]);
            }
        }
        return maxProfit;
    }

    public int maxProfit2(int k, int[] prices) {
        int[] profit = new int[prices.length];
        profit[0] = 0;
        for (int i = 1; i < profit.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit[i] = prices[i] - prices[i - 1];
            }
        }
        int maxProfit = 0;
        Arrays.sort(profit);
        for (int i = 0; i < k; i++) {
            maxProfit += profit[i];
        }
        return maxProfit;
    }
}
