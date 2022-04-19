package algo.tzashinorpu.ThirdRound.Chapter12;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        // -2,1,-3,4,-1,2,1,-5,4
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
