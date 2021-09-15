package algo.tzashinorpu.Week02.Chapter07;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_077 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res =new ArrayList<>();
        int[] ints = new int[n];
        for (int i = 1; i <=n; i++) {
            ints[i - 1] = i;
        }
        boolean[] used = new boolean[n];
        dfs(ints, used, k,res);
        return res;
    }

    private void dfs(int[] ints, boolean[] used, int k, List<List<Integer>> res) {

    }
}
