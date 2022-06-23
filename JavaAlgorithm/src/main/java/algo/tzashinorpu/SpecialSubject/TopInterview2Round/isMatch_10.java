package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class isMatch_10 {
    public boolean isMatch_dfs(String s, String p) {
        /*
        '.' Matches any single character
        '*' Matches zero or more of the preceding element
        aa a*
        */
        if (p.isEmpty()) return s.isEmpty();
        boolean firstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        // b a*b
        // aaaab a*b
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // 重复0次 | 重复多次
            return (isMatch_dfs(s, p.substring(2)) || (firstMatch && isMatch_dfs(s.substring(1), p)));
        } else {
            return firstMatch && isMatch_dfs(s.substring(1), p.substring(1));
        }
    }
}
