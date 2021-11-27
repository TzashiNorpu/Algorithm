package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_518 {
    private int cnt = 0;

    // 这种答案是组合
    public int change1(int amount, int[] coins) {
        /*输入：amount = 5, coins = [1, 2, 5]
        输出：4
        解释：有四种方式可以凑成总金额：
        5=5
        5=2+2+1
        5=2+1+1+1
        5=1+1+1+1+1*/
        int tmpAmount = 0;
        dfs(tmpAmount, amount, coins);
        return this.cnt;
    }

    private void dfs(int tmpAmount, int amount, int[] coins) {
        if (tmpAmount > amount) {
            return;
        }
        if (tmpAmount == amount) {
            this.cnt++;
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            dfs(tmpAmount + coins[i], amount, coins);
        }
    }

    /*对于面额为 coin 的硬币，当 coin≤i≤amount 时，如果存在一种硬币组合的金额之和等于 i−coin，则在该硬币组合中增加一个面额为 coin 的硬币，
    即可得到一种金额之和等于 i 的硬币组合。因此需要遍历 coins，对于其中的每一种面额的硬币，更新数组 dp 中的每个大于或等于该面额的元素的值。*/
    public int change2(int amount, int[] coins) {
        /*输入：amount = 5, coins = [1, 2, 5]
        dp=[1,1,2,3,4,4]
        输出：4
        解释：有四种方式可以凑成总金额：
        5=5
        5=2+2+1
        5=2+1+1+1
        5=1+1+1+1+1*/
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    // 重复 -> 排列
                    // dp[4] = dp[2]+dp[3] {dp[2]:1+1 2  dp[3]:1+1+1 2+1 3  dp[4]:1+1+1+1 2+1+1 2+2 4}
                    // dp[5] = dp[1]+dp[3]+dp[4]
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        return dp[amount];
    }

    public int change3(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int j = 0; j < coins.length; j++) {
            for (int i = coins[j]; i <= amount; i++) {
                if (i - coins[j] >= 0) {
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        return dp[amount];
    }
}
