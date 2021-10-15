package algo.tzashinorpu.Week02.Chapter08;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_2_078 {
    public List<List<Integer>> subsets1(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, nums, temp, res);
        return res;
    }

    private void dfs(int curr, int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if (curr == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[curr]);
        dfs(curr + 1, nums, temp, res);
        temp.remove(temp.size() - 1);
        dfs(curr + 1, nums, temp, res);
    }


    public List<List<Integer>> subsets2(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < Math.pow(2, len); i++) {
            String s = Integer.toBinaryString(i);
            String format = "%" + len + "s";
            String[] mask = String.format(format, s).split("");
            for (int j = 0; j < len; j++) {
                if (mask[j].equals("1")) {
                    temp.add(nums[j]);
                }
            }
            res.add(new ArrayList<>(temp));
            temp.clear();
        }
        return res;
    }
}
