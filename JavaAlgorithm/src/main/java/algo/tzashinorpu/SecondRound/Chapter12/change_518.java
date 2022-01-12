package algo.tzashinorpu.SecondRound.Chapter12;

import java.util.Arrays;

public class change_518 {
    public int change(int amount, int[] coins) {
        //amount = 5, coins = [2,  5] -> 2
        // 0 1 2 3 4 5 6 7 8 14    ->
        // 1 0 1 0 1 1 1 1
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j - coins[i] >= 0) {
                    dp[j] = dp[j] + dp[j - coins[i]];
                }
            }
        }
        return dp[amount];
    }
}
