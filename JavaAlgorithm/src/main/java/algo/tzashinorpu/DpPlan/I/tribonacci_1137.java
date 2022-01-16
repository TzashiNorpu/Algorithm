package algo.tzashinorpu.DpPlan.I;

public class tribonacci_1137 {
    public int tribonacci(int n) {
        int[] dp = new int[Math.max(n, 3) + 1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
