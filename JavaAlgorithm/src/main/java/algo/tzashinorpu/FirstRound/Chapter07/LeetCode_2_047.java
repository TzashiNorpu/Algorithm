package algo.tzashinorpu.FirstRound.Chapter07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_2_047 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        boolean[] used = new boolean[length];
        ArrayList<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums, length, used, temp, res);
        return res;
    }

    private void backTrack(int[] nums, int length, boolean[] used, ArrayList<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == length) {
            res.add((ArrayList<Integer>) temp.clone());
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]) {
                continue;
            }
            // i-1 在本次递归中已经选择了的，和他值相同的 i 元素也可以再进行选择
            // 1,1,2在 1,2 & true,false,true 的条件时在第三次时仍可已选择 i=1 时的元素1
            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            backTrack(nums, length, used, temp, res);
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}
