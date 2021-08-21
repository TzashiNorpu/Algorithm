package algo.tzashinorpu.Week05.Chapter12.Exercise;

public class LeetCode_5_062 {
    // https://leetcode-cn.com/problems/unique-paths/
    // 不同路径

    public int uniquePaths1(int m, int n) {
        // m列   n行
        int[][] elePath = new int[n][m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 || j == m - 1) {
                    elePath[i][j] = 1;
                } else {
                    elePath[i][j] = elePath[i + 1][j] + elePath[i][j + 1];
                }
            }
        }
        return elePath[0][0];
    }

    public int uniquePaths2(int m, int n) {
        // m列   n行
        if (m < 1 || n < 1) return 0;
        int[] dp = new int[n];
        for (int i = m-1; i >= 0; i--){
            for (int j = n-1; j >= 0; j--){
                if (j == n - 1){
                    dp[j] = 1;
                }
                else{
                    dp[j] = dp[j] + dp[j+1];
                }
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        LeetCode_5_062 test = new LeetCode_5_062();
        System.out.println(test.uniquePaths2(7, 3));
    }

}
