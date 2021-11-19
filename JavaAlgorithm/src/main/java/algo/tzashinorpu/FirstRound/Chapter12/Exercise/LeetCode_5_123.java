package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import java.sql.Array;
import java.util.ArrayDeque;

public class LeetCode_5_123 {
    public int maxProfit1(int[] prices) {
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
        int impossible = Integer.MIN_VALUE / 2;
        dp[0][0][1] = impossible; // 不合法
        dp[0][1][0] = -prices[0];
        dp[0][0][2] = impossible;
        dp[0][1][1] = impossible; // 不合法
        dp[0][1][2] = impossible; // 不合法
        for (int i = 1; i < length; i++) {
            dp[i][0][0] = 0;
            dp[i][0][1] = Math.max(dp[i - 1][1][0] + prices[i], dp[i - 1][0][1]);
            dp[i][0][2] = Math.max(dp[i - 1][1][1] + prices[i], dp[i - 1][0][2]);

            dp[i][1][0] = Math.max(dp[i - 1][0][0] - prices[i], dp[i - 1][1][0]);
            // 不持股买入 + 持股卖出（不持股了?）  至多持一股
            // [1][1]  : 买入两次  卖出一次
//            dp[i][1][1] = Math.max(Math.max(dp[i - 1][0][1] - prices[i], dp[i - 1][1][0] + prices[i]), dp[i - 1][1][1]);
            dp[i][1][1] = Math.max(dp[i - 1][0][1] - prices[i], dp[i - 1][1][1]);
            dp[i][1][2] = impossible;
        }
        return Math.max(Math.max(dp[length - 1][0][1], dp[length - 1][0][2]), 0);
    }

    public int maxProfit2(int[] prices) {
      /*  任意一天结束之后，我们会处于以下五个状态中的一种：
        未进行过任何操作
        只进行过一次买操作 oneBuy
        进行了一次买操作和一次卖操作，即完成了一笔交易 oneTransaction
        在完成了一笔交易的前提下，进行了第二次买操作 oneTransactionAndOneBuy
        完成了全部两笔交易  twoTransaction*/

       /*
       第0天：
       oneBuy就是买一次：-price[0]
       oneTransaction就是买 price[0] 再卖 price[0] ：0
       oneTransactionAndOneBuy就是买 price[0] 卖 price[0]，再买 price[0]：-price[0]
       twoTransaction就是买 price[0] 卖 price[0]，再买 price[0]再卖 price[0]：0
        */

        int oneBuy = -prices[0];
        int oneTransaction = 0;
        int oneTransactionAndOneBuy = -prices[0];
        int twoTransaction = 0;

        for (int i = 1; i < prices.length; i++) {
            oneBuy = Math.max(oneBuy, -prices[i]);
            oneTransaction = Math.max(oneBuy + prices[i], oneTransaction);
            oneTransactionAndOneBuy = Math.max(oneTransaction - prices[i], oneTransactionAndOneBuy);
            twoTransaction = Math.max(oneTransactionAndOneBuy + prices[i], twoTransaction);
        }
        return Math.max(oneTransaction, twoTransaction);
    }

}
