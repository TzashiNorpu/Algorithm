package algo.tzashinorpu.ThirdRound.Chapter12;

public class rob_198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int max = dp[1];
        for (int i = 2; i < len; i++) {
            // dp[i] = max(dp[i-1],dp[i-2]+nums[i)
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
