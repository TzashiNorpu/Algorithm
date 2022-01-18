package algo.tzashinorpu.DpPlan.I;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        // -2, 1, -3, 4, -1, 2, 1, -5, 4
        int max = nums[0];
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        for (int i = 1; i < length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
