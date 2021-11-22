package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import java.util.Arrays;

public class LeetCode_5_188 {
    public int maxProfit1(int k, int[] prices) {
        /*
         * have[i][j]表示第i天进行 j 笔交易, 并且当前手上持有一支股票, 这种情况下的最大利润.
         * no[i][j] 表示第i天进行 j 笔交易, 并且当前手上不持有股票, 这种情况下的最大利润.
         * 天数一共是 prices 的长度
         */
        if (prices.length == 0) {
            return 0;
        }
        int ILLEGALVALUE = Integer.MIN_VALUE / 2;
        int length = prices.length;
        int[][] have = new int[length][k+1];
        int[][] none = new int[length][k+1];
        // 默认一买一卖才算完整交易一次, 买入不算交易, 卖出才算一次交易
        have[0][0] = -prices[0];
        none[0][0] = 0;
        for (int i = 1; i <=k; i++) {
            have[0][i] = ILLEGALVALUE;
            none[0][i] = ILLEGALVALUE;
        }
        for (int i = 1; i < length; i++) {
            have[i][0] = Math.max(have[i - 1][0],-prices[i]);
        }
        for (int i = 1; i < length; i++) {
            for (int j = 1; j <=k; j++) {
                have[i][j] = Math.max(have[i - 1][j], none[i - 1][j] - prices[i]);
                none[i][j] = Math.max(none[i - 1][j], have[i - 1][j - 1] + prices[i]);
            }
        }
        // 二维数组的最大值
        return Arrays.stream(none[length-1]).max().getAsInt();
    }

    public int maxProfit2(int k, int[] prices) {
        // have[i][j]  i:天数，和prices长度相同，j是交易次数
        int days = prices.length;
        int[][] have = new int[days][k + 1];
        int[][] none = new int[days][k + 1];
        have[0][0] = -prices[0];
        none[0][0] = 0;
        for (int i = 1; i < days; i++) {
            have[i][0] = Math.max(have[i-1][0],-prices[i]);
        }
        int ILLEGAL = Integer.MIN_VALUE/2;
        for (int i = 1; i <=k; i++) {
            have[0][k] = ILLEGAL;
            none[0][k] = ILLEGAL;
        }
        for (int i = 1; i < days; i++) {
            for (int j = 1; j <=k; j++) {
                // 第 i-1 天为 j 次交易时做了买入操作交易后次数还是 j，只有卖出后交易次数才 + 1
                have[i][j]=Math.max(have[i-1][j],none[i-1][j]-prices[i]);
                none[i][j] =Math.max(none[i-1][j],have[i-1][j-1]+prices[i]);
            }
        }
        return Arrays.stream(none[days - 1]).max().getAsInt();
    }
}
