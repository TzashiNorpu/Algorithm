package algo.tzashinorpu.ThirdRound.Chapter08;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        // [1,2,3]->[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> tmp = new Stack<>();
        int level = 0;
        backTrack(nums, tmp, res, level);
        return res;
    }

    private void backTrack(int[] nums, Stack<Integer> tmp, List<List<Integer>> res, int level) {
        if (level == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        backTrack(nums, tmp, res, level + 1);
        tmp.push(nums[level]);
        backTrack(nums, tmp, res, level + 1);
        tmp.pop();
    }
}
