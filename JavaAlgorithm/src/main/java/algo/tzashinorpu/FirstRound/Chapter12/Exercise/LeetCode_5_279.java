package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_279 {
    public int numSquares(int n) {
        // 13
        // [0,1,2,3,4,5,6,7,8,9,10,11,12,13]
        // [0,1,2,3,1,2,3,4,2,1, 2, 3, 3, 2]
        int[] dp = new int[n + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}