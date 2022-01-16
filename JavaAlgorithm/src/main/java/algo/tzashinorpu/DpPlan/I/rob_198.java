package algo.tzashinorpu.DpPlan.I;

public class rob_198 {
    public int rob(int[] nums) {
        // 2,1,1,2
        int length = nums.length;
        int[] dp = new int[length + 1];
        dp[1] = nums[0];
        for (int i = 2; i <= length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }
        return dp[length];
    }
}
