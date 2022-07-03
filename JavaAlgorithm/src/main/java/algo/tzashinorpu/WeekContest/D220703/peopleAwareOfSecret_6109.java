package algo.tzashinorpu.WeekContest.D220703;

public class peopleAwareOfSecret_6109 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int[][] dp = new int[n][forget];
        int sum = 0;
        dp[0][0] = 1;
        int MOD = 1000000007;
        for (int i = 1; i < n; i++) {
            for (int j = delay - 1; j < forget - 1; j++) {
                dp[i][0] = (dp[i][0] + dp[i - 1][j]) % MOD;
            }
            for (int j = 1; j < forget; j++) {
                dp[i][j] = (dp[i][j] + dp[i - 1][j - 1]) % MOD;
            }
        }
        for (int j = 0; j < forget; j++) {
            sum = (sum + dp[n - 1][j]) % MOD;
        }
        return sum;
    }
}
