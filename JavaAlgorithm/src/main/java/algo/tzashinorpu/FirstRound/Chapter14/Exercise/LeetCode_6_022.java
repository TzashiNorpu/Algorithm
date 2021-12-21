package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_6_022 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        dfs(0, 0, n, "", res);
        return res;
    }

    private void dfs(int l, int r, int n, String s, ArrayList<String> res) {
        if (l == n && r == n) {
            res.add(s);
            return;
        }
        // 剪枝
        if (l < n) {
            dfs(l + 1, r, n, s + "(", res);
        }
        // 剪枝
        if (r < l) {
            dfs(l, r + 1, n, s + ")", res);
        }
    }
}
