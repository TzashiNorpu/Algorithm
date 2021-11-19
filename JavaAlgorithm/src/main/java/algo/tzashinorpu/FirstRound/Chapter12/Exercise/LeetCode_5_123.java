package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import java.sql.Array;
import java.util.ArrayDeque;

public class LeetCode_5_123 {
    public int maxProfit(int[] prices) {
        // 卖出时利润 + prices[i]    买入时 - prices[i]
        // dp 方程: dp[天数][当前是否持股][卖出的次数]
        /*一天结束时的6种状态：
        未持股，未卖出过股票：说明从未进行过买卖，利润为0
        dp[i][0][0]=0
        未持股，卖出过1次股票：可能是今天卖出，也可能是之前卖的（昨天也未持股且卖出过）
        dp[i][0][1]=max(dp[i-1][1][0]+prices[i],dp[i-1][0][1])
        未持股，卖出过2次股票:可能是今天卖出，也可能是之前卖的（昨天也未持股且卖出过）
        dp[i][0][2]=max(dp[i-1][1][1]+prices[i],dp[i-1][0][2])
        持股，未卖出过股票：可能是今天买的，也可能是之前买的（昨天也持股）
        dp[i][1][0]=max(dp[i-1][0][0]-prices[i],dp[i-1][1][0])
        持股，卖出过1次股票：可能是今天买的，也可能是之前买的（昨天也持股）
        dp[i][1][1]=max(dp[i-1][0][1]-prices[i],dp[i-1][1][1])
        持股，卖出过2次股票：最多交易2次，这种情况不存在
        dp[i][1][2]=float('-inf')*/
        int length = prices.length;
        int[][][] dp = new int[length][2][3];
        dp[0][0][0] = 0;
        dp[0][0][1] = 0; // 不合法
        dp[0][1][0] = -prices[0];
        dp[0][1][1] = 0; // 不合法
        dp[0][1][2] = 0; // 不合法
        for (int i = 1; i < length; i++) {
            dp[i][0][0] = 0;
            dp[i][0][1] = Math.max(dp[i-1][1][0] + prices[i],dp[i-1][0][1]);
            dp[i][0][2] = Math.max(dp[i-1][1][1] + prices[i],dp[i-1][0][2]);

            dp[i][1][0] = Math.max(dp[i-1][0][0] - prices[i],dp[i-1][1][0]);
//            dp[i][1][1] = Math.max(dp[i-1][1][0] + prices[i],dp[i-1][1][1]);
            dp[i][1][1] = Math.max(dp[i-1][0][1] - prices[i],dp[i-1][1][1]);
            dp[i][1][2] = 0;
        }
        return Math.max(dp[length - 1][0][1], dp[length - 1][0][2]);
    }
}
