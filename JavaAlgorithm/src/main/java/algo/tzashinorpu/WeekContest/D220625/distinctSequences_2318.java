package algo.tzashinorpu.WeekContest.D220625;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class distinctSequences_2318 {


    /*
    DP问题:
    思考:
    设当前为第t(t从1开始) 次掷骰子, 要判断第t次掷骰子的结果是否满足条件, 我们要关注哪些变量 ?
    提示1 :
    相邻点数要求互质且不等, 因此与第t - 1 次点数有关, 要满足互质且不等的条件
    提示2:
    相等点数之间至少有2个其他值的点数, 说明与第t - 2 次的点数也有关, 不能相等
    提示3:
    同时第t - 1 次与第t - 2 次的点数互质且不等, 至于第t - 3 次不会对第t次的投掷造成约束

    如果单纯考虑设dp[t][i] 为第t次掷骰子, 掷出i点的方案数, 通过dp[t - 2] 来转移累加会导致t - 1 与t - 3 不兼容的结果也统计了
    1. 状态定义:
    设dp[t][i][j] 为第t次掷了i点, 第t - 1 次掷了j点的方案数
    2. 状态转移:
    dp[t][i][j] {第t次掷了i点, 第t - 1 次掷了j点} 可以由dp[t - 1][j][k] { 第t-1次掷了j点, 第t - 2 次掷了k点} 转移得到
    2.1 先遍历第 t - 1 次的 1 - 6 点数 j, 此时 j 只取 与 k 互质且不等的【提示3：t-1次与t-2次】 && 与 i 互质且不等【提示1：t次与t-1次】
    2.2 再遍历第 t - 2 次的 1 - 6 点数 k, 此时 k 只取 与 i 不等的【提示2：t次与t-2次】
    第 t 次掷骰子不受第 t - 3 次的结果约束
    显然 dp[t][i][j] =dp[t][i][j] + dp[t - 1][j][k] ,此时j的约束由 dp[t - 1][j][k] 已经转移的状态 结合 dp[ t - 2][j - 1][k - 1] 的 k - 1 决定是合法的
    3. 初始化:
    要初始化第2次掷骰子的情形 dp[2][i][j] = i与j互质且不等 ? 1 : 0

    时间复杂度:
    O(N * 6 ^ 3) 空间复杂度:
    O(N * 6 ^ 2)
    */
    private static final int MOD = (int) 1e9 + 7;
    private static final int MX = (int) 1e4;
    private static final int[][][] dp = new int[MX + 1][6][6];

    static {
        for (var i = 0; i < 6; ++i)
            for (var j = 0; j < 6; ++j)
                if (j != i && gcd(j + 1, i + 1) == 1)
                    dp[2][i][j] = 1;
        for (var i = 2; i < MX; ++i)
            // j 是 t 次的点数
            for (var j = 0; j < 6; ++j)
                // last 是 t-1 次的点数   last2 是 t-2 次的点数
                for (var last = 0; last < 6; ++last)
                    // t次与t-1次互质且不相等 【索引是0开始，点数需要+1】
                    if (last != j && gcd(last + 1, j + 1) == 1)
                        for (var last2 = 0; last2 < 6; ++last2)
                            //  t次与t-2次互不相等  t-1次与t-2次互质且不相等
                            if (last2 != j && (last != last2 && gcd(last + 1, last2 + 1) == 1))
                                // dp[i + 1][j][last] + dp[i][last][last2] 是对 dp[i][last][last2] 的累加
                                dp[i + 1][j][last] = (dp[i + 1][j][last] + dp[i][last][last2]) % MOD;
    }

    public int distinctSequences(int n) {
        if (n == 1) return 6;
        var ans = 0;
        for (var i = 0; i < 6; ++i)
            for (var j = 0; j < 6; ++j)
                ans = (ans + dp[n][i][j]) % MOD;
        return ans;
    }


    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
