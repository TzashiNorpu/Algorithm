package algo.tzashinorpu.WeekContest.D220626;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = max;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}

