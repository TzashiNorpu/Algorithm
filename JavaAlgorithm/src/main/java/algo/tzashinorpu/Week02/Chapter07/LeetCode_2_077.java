package algo.tzashinorpu.Week02.Chapter07;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_077 {
    public List<List<Integer>> combine(int n, int k) {
        // 1..3   2 --> [[1,2],[1,3],[2,3]]
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int beginIndex = 1;
        dfs(n, k, beginIndex, res, temp);
        return res;
    }

    private void dfs(int n, int k, int beginIndex, ArrayList<List<Integer>> res, ArrayList<Integer> temp) {
        if (temp.size() == k) {
            res.add((List<Integer>) temp.clone());
            return;
        }
        // beginIndex <--> n-beginIndex -1
        // begin 右移时 本次遍历的右边界不能移动 --> beginIndex <--> n-beginIndex + (len(temp)) - 1
        for (int i = beginIndex; i <= n; i++) {
            temp.add(i);
            dfs(n, k, i + 1, res, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
