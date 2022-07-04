package algo.tzashinorpu.WeekContest.D220703;

public class peopleAwareOfSecret_6109 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {

        int[] dp = new int[n + 1];
        dp[1] = 1;
        int MOD = 1000000007;
        for (int i = 1; i < n + 1; i++) {
            /*for (int j = i + delay; j < i + forget; j++) {
                if (j <= n) (dp[j] + dp[i]) % MOD;
            }*/
            for (int j = i + delay; j < Math.min(i + forget, n + 1); j++) {
                dp[j] = (dp[j] + dp[i]) % MOD;
            }
            // [i-forget+1,i-delay]
            // i=2->[-1,0]    i=3->[0,1]   i=5->[2,3]
            /*for (int j = i - forget + 1; j <= i - delay; j++) {
                if (j >= 0 && j <= n) dp[i] = (dp[i] + dp[j]) % MOD;
            }*/
        }
        int sum = 0;
        for (int i = n + 1 - forget; i < n + 1; i++) {
            sum = (sum + dp[i]) % MOD;
        }
        return sum;
    }
}
