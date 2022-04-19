package algo.tzashinorpu.ThirdRound.Chapter12;

public class coinChange_322 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount + 1];
        dp[0] = -1;
        for (int i = 1; i <= amount; i++) {
            // 2,3,4
            // 0,1,2,3,4,5,6,7,8,9,10,11
            // 0,0,1,1,1,
            int cnt = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                // dp[amount-coins[j] + 1
                int remain = i - coins[j];
                if (remain == 0) cnt = Math.min(1, cnt);
                if (remain > 0 && dp[remain] != -1) {
                    int tmp = dp[remain] + 1;
                    cnt = Math.min(cnt, tmp);
                }
            }
            dp[i] = (cnt == Integer.MAX_VALUE ? -1 : cnt);
        }
        return dp[amount];
    }
}
