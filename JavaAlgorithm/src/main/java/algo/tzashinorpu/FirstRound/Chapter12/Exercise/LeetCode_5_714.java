package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_714 {
    public int maxProfit1(int[] prices, int fee) {
         // dp[i][0] 表示第 i 天交易完后手里没有股票的最大利润，dp[i][1] 表示第 i 天交易完后手里持有一支股票的最大利润（i 从 0 开始）
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]-fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }

    // 当我们卖出一支股票时，我们就立即获得了以相同价格并且免除手续费[可以不再这个价格上卖出，选择在另外的价格上卖出]买入一支股票的权利
    public int maxProfit2(int[] prices, int fee) {
        //  {1,6,4,8,4,9}
        // 2
        int buy = prices[0]+fee;
        int maxProfit=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] + fee < buy) {
                buy = prices[i]+fee;
            }else if(prices[i]>buy){
                maxProfit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return maxProfit;
    }
}
