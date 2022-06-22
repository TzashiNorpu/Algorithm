package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class permute_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> temp = new Stack<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(res, nums, temp, visited, 0);
        return res;
    }

    private void backTrack(List<List<Integer>> res, int[] nums, Stack<Integer> temp, boolean[] visited, int level) {
        if (level == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.push(nums[i]);
                backTrack(res, nums, temp, visited, level + 1);
                temp.pop();
                visited[i] = false;
            }
        }
    }
}
