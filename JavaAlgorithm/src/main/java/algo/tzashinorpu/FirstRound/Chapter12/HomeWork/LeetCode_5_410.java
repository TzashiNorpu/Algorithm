package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import java.util.Arrays;

public class LeetCode_5_410 {
    /*
    输入：nums = [7,2,5,10], m = 3
    7<->2<->5 10
    7<->2 5<->10
    7 2<->5<->10
    输出：10
    输入：nums = [7,2,5,10], m = 2
    输出：14
    */
    public int splitArray(int[] nums, int m) {
        // dp[i][j] : i 个数分成 j 段
        int length = nums.length;
        int[][] dp = new int[length + 1][m + 1];
        int INVALID = Integer.MAX_VALUE;
        /*for (int i = 1; i <= length; i++) {
            dp[i][0] = INVALID;
        }*/

        for (int i = 0; i <= length; i++) {
            Arrays.fill(dp[i], INVALID);
        }
        dp[0][0] = 0;
        int[] sum = new int[length + 1];
        for (int i = 0; i < length; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        // dp[i][j]  = min([k:0->i-1] max(dp[k][j-1],sum(k+1,i)))
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= m; j++) {
                if (i < j) {
                    // i<j:invalid
                    continue;
                }
                for (int k = 0; k <= i; k++) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[k][j - 1], sum[i] - sum[k]));
                }
            }
        }
        return dp[length][m];
    }
}
