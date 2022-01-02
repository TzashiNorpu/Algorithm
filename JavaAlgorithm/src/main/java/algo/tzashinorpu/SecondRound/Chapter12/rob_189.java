package algo.tzashinorpu.SecondRound.Chapter12;

public class rob_189 {
    public int rob(int[] nums) {
        // dp[i] = max(dp[i-2]+nums[i],dp[i-1])
        int length = nums.length;
        int[] dp = new int[Math.max(length, 2)];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }
}
