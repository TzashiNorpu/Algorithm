package algo.tzashinorpu.DpPlan.GSSY.Path;

public class numSquares_279 {
    // 给定了若干个数字，每个数字可以被使用无限次，求凑出目标值n所需要用到的是最少数字个数是多少。
    // dp[i][j]为考虑前i个数字，凑出数字总和j所需要用到的最少数字数量。

    public int numSquares1(int n) {
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i * i;
        }
        // 13->2:4+9
        // 1,4,9
        // dp[i][j]=min(dp[i-1][j-k*num])+k
        int INF = -1;
        int[][] dp = new int[n][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
        /*for (int i = 0; i < n; i++) {
            dp[i][0] = 0;
        }*/
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            for (int j = 1; j <= n; j++) {
                int temp = Integer.MAX_VALUE;
                // 选k个和不选【k=0】
                for (int k = 0; j - k * num >= 0; k++) {
                    if (dp[i - 1][j - k * num] != -1)
                        temp = Math.min(temp, dp[i - 1][j - k * num] + k);
                }
                dp[i][j] = temp == Integer.MAX_VALUE ? INF : temp;
            }
        }
        return dp[n - 1][n];
    }

    // 空间优化
    public int numSquares2(int n) {
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i * i;
        }
        int INF = -1;

        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
        }
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            for (int j = num; j <= n; j++) {
                /*int temp = Integer.MAX_VALUE;
                // 选k个和不选【k=0】

                for (int k = 0; j - k * num >= 0; k++) {
                    if (dp[j - k * num] != INF)
                        temp = Math.min(temp, dp[j - k * num] + k);
                }
                dp[j] = temp == Integer.MAX_VALUE ? INF : temp;*/
                if (dp[j - num] != INF) dp[j] = Math.min(dp[j], dp[j - num] + 1);
            }
        }
        return dp[n];
    }
}
