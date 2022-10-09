package algo.tzashinorpu.WeekContest.D221009;

public class numberOfPaths_6203 {
    public int numberOfPaths(int[][] grid, int k) {
        /*
         * 每一步只能往 下 或者往 右
         * 定义 f[i][j][v] 表示从左上走到 (i,j)，且路径和模 k 的结果为 v 时的路径数
         * 初始值 f[0][0][grid[0][0] mod k] = 1，答案为 f[m-1][n-1][0]
         * 状态转移 f[i][j][(v+grid[i][j]) mod k]=f[i][j−1][v]+f[i−1][j][v]
         */
        var MOD = (int) 1e9 + 7;
        int m = grid.length, n = grid[0].length;
        var f = new int[m + 1][n + 1][k];
        f[0][1][0] = 1;
        for (var i = 0; i < m; ++i)
            for (var j = 0; j < n; ++j)
                for (var v = 0; v < k; ++v)
                    f[i + 1][j + 1][(v + grid[i][j]) % k] = (f[i + 1][j][v] + f[i][j + 1][v]) % MOD;
        return f[m][n][0];
    }
}
