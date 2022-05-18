package algo.tzashinorpu.SpecialSubject.Top;

public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
//            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            dp[i] = dp[i - 1] < 0 ? nums[i] : dp[i - 1] + nums[i];
            res = Math.max(dp[i], res);
        }
        return res;
    }
}
