package algo.tzashinorpu.DpPlan.I;

public class fib_509 {
    public int fib(int n) {
        /*F(0) = 0，F(1) = 1
        F(n) = F(n - 1) + F(n - 2)，其中 n > 1*/
        int[] dp = new int[Math.max(n, 3) + 1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
