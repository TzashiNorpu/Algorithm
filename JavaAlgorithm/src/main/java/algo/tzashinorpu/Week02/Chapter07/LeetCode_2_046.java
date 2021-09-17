package algo.tzashinorpu.Week02.Chapter07;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_046 {
    public List<List<Integer>> permute(int[] nums) {
        int length = nums.length;
        boolean[] used = new boolean[length];
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        dfs(nums, used, length, temp, res);
        return res;
    }

    private void dfs(int[] nums, boolean[] used, int length, ArrayList<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == length) {
            res.add((List<Integer>) temp.clone());
            return;
        }
        for (int i = 1; i <= length; i++) {
            if (used[i - 1]) {
                continue;
            }
            temp.add(i);
            used[i - 1] = true;
            dfs(nums, used, length, temp, res);
            used[i - 1] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
