package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis_22 {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(0, 0, n, "");
        return res;
    }

    private void dfs(int l, int r, int n, String s) {
        if (l == n && r == n) {
            res.add(s);
            return;
        }
        if (l < n) {
            dfs(l + 1, r, n, s + "(");
        }
        if (r < l) {
            dfs(l, r + 1, n, s + ")");
        }
    }
}
