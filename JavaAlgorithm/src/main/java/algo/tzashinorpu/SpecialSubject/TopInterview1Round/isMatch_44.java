package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

public class isMatch_44 {
    public boolean isMatch(String s, String p) {
        // 超时
        if (s.equals(p)) return true;
        if (p.isEmpty()) return s.isEmpty();
        if (s.isEmpty()) {
            if (p.charAt(0) != '*') return false;
            else return isMatch(s, p.substring(1));
        }
        // s="" p="****"
        if (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?')
            return isMatch(s.substring(1), p.substring(1));
        if (p.charAt(0) == '*') {
            return isMatch(s.substring(1), p) || isMatch(s.substring(1), p.substring(1)) || isMatch(s, p.substring(1));
        }
        return false;
    }

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
    public boolean isMatchDp(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[pLen + 1][sLen + 1];
        dp[0][0] = true;
        for (int i = 1; i <= pLen; i++) {
            dp[i][0] = p.charAt(i - 1) == '*' && dp[i - 1][0];
        }
        for (int i = 1; i <= pLen; i++) {
            for (int j = 1; j <= sLen; j++) {
                if (p.charAt(i - 1) == '?' || p.charAt(i - 1) == s.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                if (p.charAt(i - 1) == '*')
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i - 1][j - 1];
            }
        }
        return dp[pLen][sLen];
    }
}
