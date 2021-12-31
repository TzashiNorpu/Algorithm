package algo.tzashinorpu.SecondRound.Chapter12;

import java.util.Arrays;
import java.util.List;

public class minimumTotal_120 {
    public int minimumTotal1(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size][size];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            int len = triangle.get(i).size();
            for (int j = 0; j < len; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == len - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
                }
            }
        }
        return Arrays.stream(dp[size - 1]).min().getAsInt();
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        // bottom to top
        int size = triangle.size();
        int[] dp = new int[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
