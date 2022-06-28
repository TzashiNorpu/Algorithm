package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class isMatch_44 {
    // 第(m,n)个格子的意义是:【p从0位置到m位置】这一整段，是否能与【s从0位置到n位置】这一整段匹配
    /*
            start   a       d       c       b       e       b
    start   true
        a         true    false   false   false   false   false
        *         true    true    true    true    true    true
        b         false   false   false   true    false   true
        ?         false   false   false   false   true    false
        b         false   false   false   false   false   true
    */
    // '?' Matches any single character
    // '*' Matches any sequence of characters (including the empty sequence).
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] && p.charAt(i - 1) == '*';
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(i - 1) == '?' || p.charAt(i - 1) == s.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                if (p.charAt(i - 1) == '*')
                    dp[i][j] = dp[i - 1][j - 1] || dp[i - 1][j] || dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}
