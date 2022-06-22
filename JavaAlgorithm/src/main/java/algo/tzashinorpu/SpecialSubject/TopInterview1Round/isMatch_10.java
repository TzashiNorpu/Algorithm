package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

public class isMatch_10 {
    public boolean isMatchRecursive(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean first_match = (!s.isEmpty() && s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        // b a*b
        // aaaab a*b
        if (s.length() >= 2 && p.charAt(1) == '*') {
            // 重复0次 | 重复多次
            return (isMatchRecursive(s, p.substring(2)) || (first_match && isMatchRecursive(s.substring(1), p)));
        } else {
            return first_match && isMatchRecursive(s.substring(1), p.substring(1));
        }
    }


    public boolean isMatchDp(String text, String pattern) {
        if (text == null || pattern == null) return false;
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < pattern.length(); i++) {
            // b  a*bc* : * count 0 times
            // b  bc* : * count 0 times
            if (pattern.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (pattern.charAt(j) == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (pattern.charAt(j) == '*') {
                    if (pattern.charAt(j - 1) != text.charAt(i) && pattern.charAt(j - 1) != '.') {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                    }
                }
            }
        }
        return dp[text.length()][pattern.length()];
    }
}
