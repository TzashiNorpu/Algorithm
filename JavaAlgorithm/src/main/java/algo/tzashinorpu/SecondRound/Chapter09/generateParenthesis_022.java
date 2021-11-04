package algo.tzashinorpu.SecondRound.Chapter09;

import java.util.LinkedList;
import java.util.List;

public class generateParenthesis_022 {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> res = new LinkedList<>();
        dfs(0, 0, n, "", res);
        return res;
    }

    private void dfs(int l, int r, int n, String temp, LinkedList<String> res) {
        if (l == n && r == n) {
            res.add(temp);
            return;
        }
        if (l >= r && l < n) {
            dfs(l + 1, r, n, temp + "(", res);
        }

        if (r < l && r < n) {
            dfs(l, r + 1, n, temp + ")", res);
        }
    }
}
