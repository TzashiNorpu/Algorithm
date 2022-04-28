package algo.tzashinorpu.DpPlan.GSSY.Path;

public class change_518 {
    public int change1(int amount, int[] coins) {
        // dp[i][j]  前 i 个金币组成 j 的方案数
        int len = coins.length;
        int[][] dp = new int[len][amount + 1];
        for (int i = 0; i < len; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i <= amount; i++) {
            dp[0][i] = (i % coins[0] == 0 ? 1 : 0);
        }
        for (int i = 1; i < len; i++) {
            int num = coins[i];
            for (int j = 1; j <= amount; j++) {
                for (int k = 0; j - k * num >= 0; k++) {
                    dp[i][j] += dp[i - 1][j - k * num];
                }
            }
        }
        return dp[len - 1][amount];
    }

    public int change2(int amount, int[] coins) {
        int len = coins.length;
        int[][] dp = new int[2][amount + 1];
        dp[0][0] = 1;
        dp[1][0] = 1;
        for (int i = 0; i <= amount; i++) {
            dp[0][i] = (i % coins[0] == 0 ? 1 : 0);
        }
        for (int i = 1; i < len; i++) {
            int num = coins[i];
            for (int j = 1; j <= amount; j++) {
                int cnt = 0;
                // 注意和 dp[n][c+1] 的区别
                // dp[n][c+1] 当前行是新计算的，没有初始值 所以可以 dp[i][j] +=
                // 但是 dp[n][c+1] 上有初始值 不能用 +=
                for (int k = 0; j - k * num >= 0; k++) {
                    cnt += dp[(i - 1) & 1][j - k * num];
                }
                dp[i & 1][j] = cnt;
            }
        }
        return dp[(len - 1) & 1][amount];
    }

    public int change3(int amount, int[] coins) {
        // dp[i][j]  前 i 个金币组成 j 的方案数
        int len = coins.length;
        int[] dp = new int[amount + 1];
        // i=0 时的初始化
        for (int i = 0; i <= amount; i++) {
            dp[i] = (i % coins[0] == 0 ? 1 : 0);
        }
        for (int i = 1; i < len; i++) {
            int num = coins[i];
            for (int j = num; j <= amount; j++) {
                dp[j] += dp[j - num];
            }
        }
        return dp[amount];
    }


}
