package algo.tzashinorpu.DpPlan.I;

public class minCostClimbingStairs_746 {
    public int minCostClimbingStairs(int[] cost) {
        // 输入：cost = [1,100,1,1,1,100,1,1,100,1]
        // 输出：6
        // 10,15,20
        int length = cost.length;
        int[] dp = new int[length + 1];
        if (length == 1) {
            return cost[0];
        }
        /*dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[length - 1], dp[length - 2]);*/
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[length];
    }
}
