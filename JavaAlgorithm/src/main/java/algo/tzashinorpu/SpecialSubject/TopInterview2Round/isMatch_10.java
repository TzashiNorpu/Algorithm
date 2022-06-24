package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class isMatch_10 {
    public boolean isMatch_dfs(String s, String p) {
        /*
        '.' Matches any single character
        '*' Matches zero or more of the preceding element
        aaa a*
        b  a*b
        a .*
        */
        if (p.isEmpty()) return s.isEmpty();
        boolean first_match = !s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.');
        if (p.length() > 1 && p.charAt(1) == '*') {
            // 0 次 | 多次
            return (first_match && isMatch_dfs(s.substring(1), p)) || isMatch_dfs(s, p.substring(2));
        } else {
            return first_match && isMatch_dfs(s.substring(1), p.substring(1));
        }
    }
}
