package algo.tzashinorpu.FirstRound.Chapter09;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_022 {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> res = new LinkedList<>();
        dfs(0, 0, n, "", res);
        return res;
    }

    private void dfs(int l, int r, int n, String temp, LinkedList<String> res) {
        if (r == n) {
            res.offer(temp);
            return;
        }
        if (l < n && l >= r) {
            dfs(l + 1, r, n, temp + "(", res);
        }
        // 这个地方不能用 else ，递归回退的时候不会执行添加 ")" 的逻辑
        if (r < l) {
            dfs(l, r + 1, n, temp + ")", res);
        }

    }
}
