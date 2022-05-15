package algo.tzashinorpu.GSSY.Path;

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
}
