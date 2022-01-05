package algo.tzashinorpu.SecondRound.Chapter12;

import java.util.Arrays;

public class coinChange_322 {
    private int step = Integer.MAX_VALUE;

    public int coinChangeDfs(int[] coins, int amount) {
        Integer[] integers = Arrays.stream(coins).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, (a, b) -> b - a);
        dfs(integers, amount, 0);
        return step == Integer.MAX_VALUE ? -1 : step;
    }

    private void dfs(Integer[] coins, int amount, int step) {
        if (amount == 0) {
            this.step = Math.min(step, this.step);
            return;
        }
        if (amount < 0) {
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            dfs(coins, amount - coins[i], step + 1);
        }
    }

    public int coinChangeDp1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // 1,2,5  11=dp[11-1]+1 11=dp[11-2]+1 11=dp[11-5]+1
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                min = Math.min(min, i - coins[j] < 0 ? min : dp[i - coins[j]]);
            }
            dp[i] = min == Integer.MAX_VALUE ? min : min + 1;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public int coinChangeDp2(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // 1,2,5  11=dp[11-1]+1 11=dp[11-2]+1 11=dp[11-5]+1
        for (int i = 1; i <= amount; i++) {
            int min = amount + 1; // 用 MAX_VALUE 会使 dp[i - coin] + 1 溢出
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                min = Math.min(min, dp[i - coin] + 1);
            }
            dp[i] = min;
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
