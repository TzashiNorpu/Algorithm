package algo.tzashinorpu.Week05.Chapter12.HomeWork;

public class LeetCode_5_064 {
    // https://leetcode-cn.com/problems/minimum-path-sum/
    // 最小路径和
    // 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        // 行
        for (int i = grid.length - 1; i >= 0; i--) {
            // 列
            for (int j = grid[0].length - 1; j >= 0; j--) {
                // 最后一行不包括最后一个元素
                if (i == grid.length - 1 && j != grid[0].length - 1){
                    System.out.println(i+"**"+j+"$$"+dp[i][j + 1]);
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                }
                // 最后一列不包括最后一个元素
                else if (j == grid[0].length - 1 && i != grid.length - 1)
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                // 其他元素(非最后一行和最后一列)
                else if (j != grid[0].length - 1 && i != grid.length - 1)
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                // 最后一个元素
                else
                    dp[i][j] = grid[i][j];
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] arr ={{1,3,4,8},{3,2,2,4},{5,7,1,9},{2,3,2,3}};
        final LeetCode_5_064 test = new LeetCode_5_064();
        System.out.println(test.minPathSum(arr));
    }
}
