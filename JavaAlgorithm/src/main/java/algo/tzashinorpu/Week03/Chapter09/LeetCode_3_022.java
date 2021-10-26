package algo.tzashinorpu.Week03.Chapter09;

import java.util.LinkedList;
import java.util.List;

public class LeetCode_3_022 {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> res = new LinkedList<>();
        dfs(n, res);
        return res;
    }

    private void dfs(int n, LinkedList<String> res) {
        
    }
}
