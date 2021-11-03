package algo.tzashinorpu.SecondRound.Chapter08;

import java.util.LinkedList;
import java.util.List;

public class subsets_078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        recursive(0, nums, temp, res);
        return res;
    }

    private void recursive(int level, int[] nums, LinkedList<Integer> temp, List<List<Integer>> res) {
        if (level == nums.length) {
            res.add(new LinkedList<>(temp));
            return;
        }
        temp.push(nums[level]);
        recursive(level + 1, nums, temp, res);
        temp.pop();
        recursive(level + 1, nums, temp, res);
    }
}
