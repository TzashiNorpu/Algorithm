package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_188 {
    public int maxProfit(int k, int[] prices) {
        /*buy[i][j] 表示对于数组 prices[0..j] 中的价格而言，进行恰好 i 笔交易，并且当前手上持有一支股票，这种情况下的最大利润；
        用 sell[i][j] 表示恰好进行 i 笔交易，并且当前手上不持有股票，这种情况下的最大利润。*/
        /*
        边界：
        对于 buy[0..k][0]，由于只有 prices[0] 唯一的股价，因此我们不可能进行过任何交易，那么我们可以将所有的 buy[1..k][0] 设置为一个非常小的值，表示不合法的状态。
        而对于 buy[0][0]，它的值为 −prices[0]，即我们在第 0 天以 prices[0] 的价格买入股票是唯一满足手上持有股票的方法

        sell[0..k][0]，同理我们可以将所有的 sell[1..k][0] 设置为一个非常小的值，表示不合法的状态。
        而对于 sell[0][0]，它的值为 0，即我们在第 0 天不做任何事是唯一满足手上不持有股票的方法。
        */

        // k 是天数
        int maxProfit = 0;
        int ILLEGALVALUE = Integer.MIN_VALUE / 2;
        int length = prices.length;
        int[][] buy = new int[k + 1][length];
        int[][] sell = new int[k + 1][length];
        for (int i = 0; i < length; i++) {
            buy[0][i] = ILLEGALVALUE;
            sell[0][i] = 0;
        }
        for (int i = 1; i <= k; i++) {
            buy[i][0] = -prices[0];
            sell[i][0] = 0;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < length; j++) {
               /* 考虑当前手上持有的股票是否是在第 i 天买入的。
                如果是第 i 天买入的，那么在第 i-1 天时，我们手上不持有股票，对应状态 sell[i−1][j]，并且需要扣除 prices[j] 的买入花费；
                如果不是第 i 天买入的，那么在第 i−1 天时，我们手上持有股票，对应状态 buy[i−1][j]*/
                buy[i][j] = Math.max(buy[i - 1][j], sell[i - 1][j] - prices[j]);
              /*  sell[i][j]，如果是第 i 天卖出的，那么在第 i−1 天时，我们手上持有股票，对应状态 buy[i−1][j−1]，并且需要增加 prices[i] 的卖出收益；
                如果不是第 i 天卖出的，那么在第 i-1 天时，我们手上不持有股票，对应状态 sell[i−1][j]*/
                sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j - 1] + prices[j]);
            }
        }
        return maxProfit;
    }
}
