package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.List;

public class subsets_78 {
    List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        dfs(nums, 0, tmp);
        return res;
    }

    private void dfs(int[] nums, int level, ArrayList<Integer> tmp) {
        if (level == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        dfs(nums, level + 1, tmp);
        tmp.add(nums[level]);
        dfs(nums, level + 1, tmp);
        tmp.remove(tmp.size() - 1);
    }
}
