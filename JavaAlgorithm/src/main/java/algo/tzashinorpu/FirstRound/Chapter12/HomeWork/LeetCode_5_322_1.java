package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import java.util.Arrays;

public class LeetCode_5_322_1 {
    public int coinChange(int[] coins, int amount) {
        /*输入：coins = [1, 4, 5], amount = 13
        输出：4
        解释：8 = 4+4+4+1*/
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int minCnt = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (i - coin == 0) {
                    minCnt = 1;
                    break;
                }
                if (i - coin > 0) {
                    if (dp[i - coin] != -1 && dp[coin] != -1) {
                        minCnt = Math.min(dp[i - coin] + dp[coin], minCnt);
                    }
                }
            }
            dp[i] = (minCnt == Integer.MAX_VALUE ? -1 : minCnt);
        }
        return dp[amount];
    }
}
