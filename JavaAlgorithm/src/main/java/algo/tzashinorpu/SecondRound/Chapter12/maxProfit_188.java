package algo.tzashinorpu.SecondRound.Chapter12;

import java.util.Arrays;

public class maxProfit_188 {
    public int maxProfit(int k, int[] prices) {
        // 3,2,6,5,0,3  k=2  7
        int length = prices.length;
        if (length == 0) {
            return 0;
        }
        // 一次买入  一次交易 一次交易+一次买入 ... 一共有 2k 个状态
        // int[][] dp = new int[length][2 * k];
        // 交易x次后手上有股票  0次交易 k次交易  所以长度为 k+1
        int[][] have = new int[length][k + 1];
        // 交易x次后手上没有股票
        int[][] no = new int[length][k + 1];
        // 买入  交易次数不变,则交易次数为0时可以进行一次买入
        for (int i = 0; i < k + 1; i++) {
            // prices[0]价格上进行i次买入卖出+1次的买入
            have[0][i] = -prices[0];
            // prices[0]价格上进行i次买入卖出
            no[0][i] = 0;
        }

        for (int i = 1; i < length; i++) {
            // have[x][0]  可以买入一次
            have[i][0] = Math.max(have[i - 1][0], -prices[i]);
            // no[x][0]  0次交易无法卖出
            no[i][0] = 0;
        }
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < k + 1; j++) {
                // 买入时交易次数不变
                have[i][j] = Math.max(no[i - 1][j] - prices[i], have[i - 1][j]);
                // 卖出时交易次数+1
                no[i][j] = Math.max(have[i - 1][j - 1] + prices[i], no[i - 1][j]);
            }
        }
        return Arrays.stream(no[length - 1]).max().getAsInt();
    }
}
