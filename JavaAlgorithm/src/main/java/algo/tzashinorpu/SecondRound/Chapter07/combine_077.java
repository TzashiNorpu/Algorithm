package algo.tzashinorpu.SecondRound.Chapter07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combine_077 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        dfs(n, k, 1, temp, res);
        return res;
    }

   /* 输入：n = 4, k = 2
    输出：
            [
            [2,4],
            [3,4],
            [2,3],
            [1,2],
            [1,3],
            [1,4],
            ]*/

    private void dfs(int n, int k, int start, LinkedList<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == k) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (int i = start; i <= n; i++) {
            temp.push(i);
            dfs(n, k, i + 1, temp, res);
            temp.pop();
        }
    }
}
