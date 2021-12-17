package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;


public class LeetCode_5_312 {
    public int maxCoins(int[] nums) {
        int length = nums.length;
        int[] temp = new int[length + 2];
        temp[0] = 1;
        temp[length + 1] = 1;
        System.arraycopy(nums, 0, temp, 1, length);
        int[][] dp = new int[length + 2][length + 2];
       /* for (int i = 0; i < length; i++) {
            for (int j = i + 2; j <= length + 1; j++) {
                for (int k = i + 1; k < j; k++) {
                    // 此时 dp[i][k] 还没有计算
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + temp[i] * temp[k] * temp[j] + dp[k][j]);
                }
            }
        }
        return dp[0][length + 1];*/
        // 1, 3, 1, 5, 8, 1
        for (int len = 3; len <= length + 2; len++) {
            for (int l = 0; l <= length + 2 - len; l++) {
                int res = 0;
                for (int k = l + 1; k < l + len - 1; k++) {
                    res = Math.max(res, dp[l][k] + temp[l] * temp[k] * temp[l + len - 1] + dp[k][l + len - 1]);
                }
                dp[l][l + len - 1] = res;
            }
        }
        return dp[0][length + 1];
    }
}
