package algo.tzashinorpu.WeekContest.D220703;

public class peopleAwareOfSecret_6109 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int[][] dp = new int[n][3];
        dp[0][0] = 1;
        dp[0][1] = forget == 0 ? dp[0][0] : 0;
        dp[0][2] = delay == 0 ? dp[0][0] : 0;
        for (int i = 1; i < n; i++) {
            // forget
            dp[i][1] = i - forget >= 0 ? dp[i - forget][0] : 0;
            // can't share
            dp[i][2] = dp[i - 1][0] - dp[i - 1][1];
            dp[i][0] = (dp[i - 1][0] - dp[i][1] - dp[i][2]) * 2 + dp[i][2];
        }
        return dp[n - 1][0];
    }
}
