package algo.tzashinorpu.SecondRound.Chapter12;

public class maxSubArray_053 {
    // dp
    public int maxSubArray1(int[] nums) {
        // -2,1,-3,4,-1,2,1,-5,4
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }

    // 减少 dp 使用的变量个数就是 greedy
    public int maxSubArray2(int[] nums) {
        // -2,1,-3,4,-1,2,1,-5,4
        int length = nums.length;
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(sum, max);
        }
        return max;
    }
}
