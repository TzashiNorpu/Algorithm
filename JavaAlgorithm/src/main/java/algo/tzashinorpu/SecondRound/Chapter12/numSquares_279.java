package algo.tzashinorpu.SecondRound.Chapter12;

public class numSquares_279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        // 12 = 1*1+11->6
        //     11=4+4+1+1+1->5
        // 12 = 2*2+8
        for (int i = 1; i <= n; i++) {
            int upper = (int) Math.sqrt(i);
            // j*j+min(dp[i-j*j])=i
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= upper; j++) {
                min = Math.min(min, dp[i - j * j]);
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
