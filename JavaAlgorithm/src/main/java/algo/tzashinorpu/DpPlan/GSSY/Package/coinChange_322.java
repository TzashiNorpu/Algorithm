package algo.tzashinorpu.DpPlan.GSSY.Package;

public class coinChange_322 {
    public int coinChange1(int[] coins, int amount) {
        // dp[i][j] 前 i 个金币凑成 j 块
        int len = coins.length;
        int[][] dp = new int[len][amount + 1];
        /*for (int i = 0; i < len; i++) {
            dp[i][0] = 0;
        }*/
        for (int i = 0; i <= amount; i++) {
            if (coins[0] == 0)
                break;
            dp[0][i] = i % coins[0] == 0 ? i / coins[0] : -1;
        }
        for (int i = 1; i < len; i++) {
            int num = coins[i];
            for (int j = 1; j <= amount; j++) {
                int count = Integer.MAX_VALUE;
                for (int k = 0; j - k * num >= 0; k++) {
                    if (dp[i - 1][j - k * num] != -1)
                        count = Math.min(count, dp[i - 1][j - k * num] + k);
                }
                dp[i][j] = count == Integer.MAX_VALUE ? -1 : count;
            }
        }
        return dp[len - 1][amount];
    }

    public int coinChange2(int[] coins, int amount) {
        // dp[i][j] 前 i 个金币凑成 j 块
        int len = coins.length;
        int[] dp = new int[amount + 1];
        /*for (int i = 0; i < len; i++) {
            dp[i][0] = 0;
        }*/
        int INF = Integer.MAX_VALUE;
        for (int i = 0; i <= amount; i++) {
            if (coins[0] == 0)
                break;
            dp[i] = i % coins[0] == 0 ? i / coins[0] : INF;
        }
        for (int i = 1; i < len; i++) {
            int num = coins[i];
            for (int j = num; j <= amount; j++) {
                /*int count = Integer.MAX_VALUE;
                for (int k = 0; j - k * num >= 0; k++) {
                    if (dp[j - k * num] != -1)
                        count = Math.min(count, dp[j - k * num] + k);
                }
                dp[j] = count == Integer.MAX_VALUE ? -1 : count;*/
                if (dp[j - num] != INF) {
                    dp[j] = Math.min(dp[j - num] + 1, dp[j]);
                }
            }
        }
        return dp[amount] == INF ? -1 : dp[amount];
    }
}
