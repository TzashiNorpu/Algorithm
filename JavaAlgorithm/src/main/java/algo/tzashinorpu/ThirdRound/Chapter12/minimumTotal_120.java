package algo.tzashinorpu.ThirdRound.Chapter12;

import java.util.Arrays;
import java.util.List;

public class minimumTotal_120 {
    public int minimumTotal1(List<List<Integer>> triangle) {
        // bottom to up
        int size = triangle.size();
        // 倒数第二层元素个数
        int[] dp = new int[size];
        for (int i = 0; i < size; i++) {
            dp[i] = triangle.get(size - 1).get(i);
        }
        // 倒数第二层开始
        for (int i = size - 2; i >= 0; i--) {
            // 遍历当前层元素
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

    /*每一行 i 具有 i+1 个数字
    只要不是第一列（j!=0）位置上的数，都能通过「左上方」转移过来
    只要不是每行最后一列（j!=i）位置上的数，都能通过「上方」转移而来*/

    public int minimumTotal2(List<List<Integer>> triangle) {
        int rows = triangle.size();
        int[][] dp = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = triangle.get(i).get(j);
                } else {
                    if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                    } else if (i == j) {
                        dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
                    }
                }
//                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
            }
        }
        return Arrays.stream(dp[rows - 1]).min().getAsInt();
    }
}
