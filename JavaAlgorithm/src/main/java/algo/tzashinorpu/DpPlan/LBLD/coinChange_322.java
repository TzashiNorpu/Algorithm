package algo.tzashinorpu.DpPlan.LBLD;

import java.util.Arrays;

public class coinChange_322 {
    public int coinChange(int[] coins, int amount) {
        int INF = amount + 1;
        int[] dp = new int[INF];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (var coin : coins) {
                if (i - coin < 0) continue;
                dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
            }
        }
        return dp[amount] == INF ? -1 : dp[amount];
    }
}
