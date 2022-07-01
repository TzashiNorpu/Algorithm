package algo.tzashinorpu.SpecialSubject.TopInterview2Round;


import java.util.Arrays;

public class longestConsecutive_128 {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] dp = new int[n];
        int max = 1;
        dp[0] = 1;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) dp[i] = dp[i - 1] + 1;
            else if (nums[i] == nums[i - 1]) dp[i] = dp[i - 1];
            else dp[i] = 1;
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
