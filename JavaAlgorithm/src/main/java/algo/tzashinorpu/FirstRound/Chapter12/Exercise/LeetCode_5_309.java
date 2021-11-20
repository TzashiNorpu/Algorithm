package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_309 {
    /*输入: [1,2,4,0,2]
    输出: 3
    解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]*/
    /*
    dp[i][x]:第i天末的状态
    ：持股或不持股(处于冷冻期或不处于冷冻期)
    dp[i][0]:持股
    dp[i][1]:不持股-处于冷冻期
    dp[i][2]:不持股-不处于冷冻期
     */
    public int maxProfit1(int[] prices) {
        int[][] dp = new int[prices.length][3];
        dp[0][0] = -prices[0];
        // 非法
        dp[0][1] = Integer.MIN_VALUE / 2;
        dp[0][2] = 0;
        for (int i = 1; i < prices.length; i++) {
            /*dp[i][0] = Math.max(Math.max(dp[i - 1][1] - prices[i], dp[i - 1][2] - prices[i]), dp[i - 1][0]);
            dp[i][1] = Math.max(Math.max(dp[i - 1][0], dp[i - 1][1]), dp[i - 1][2]);
            dp[i][2] = Math.max(Math.max(dp[i - 1][2], dp[i - 1][1]), dp[i - 1][0] + prices[i]);*/

            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
            dp[i][1] = dp[i - 1][0] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
        }
        return Math.max(dp[dp.length - 1][1], dp[dp.length - 1][2]);
    }

    public int maxProfit2(int[] prices) {
        /*要关注冷冻期！
        只关注卖出的那一天！只关注卖出的那一天！只关注卖出的那一天！
        题目中定义的“冷冻期”=卖出的那一天的后一天，题目设置冷冻期的意思是，如果昨天卖出了，今天不可买入，那么关键在于哪一天卖出，只要在今天想买入的时候判断一下前一天是不是刚卖出，即可，所以关键的一天其实是卖出的那一天，
        而不是卖出的后一天
        因为当天卖出股票实际上也是属于“不持有”的状态，那么第i天如果不持有，那这个“不持有”就有了两种状态：1.本来就不持有，指不是因为当天卖出了才不持有的；2.第i天因为卖出了股票才变得不持有.
                而持有股票依旧只有一种状态

        所以对于每一天i，都有可能是三种状态：
        0.不持股且当天没卖出, 最大收益dp[i][0];
        1.不持股且当天卖出了， 最大收益dp[i][1]；
        2.持股, 最大收益dp[i][2]；*/
        int[][] dp = new int[prices.length][3];
        dp[0][0] = 0;
        dp[0][1] = 0;// 第0天买入又卖出
        dp[0][2] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            /*dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = dp[i - 1][1] + prices[i];*/

            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][2] + prices[i];
            dp[i][2] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][2]);
        }
        return Math.max(dp[dp.length - 1][0], dp[dp.length - 1][1]);
    }

}
