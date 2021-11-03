package algo.tzashinorpu.SecondRound.Chapter07;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class permute_047 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> temp = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(nums, visited, temp, res);
        return res;

    }

    private void backTrack(int[] nums, boolean[] visited, LinkedList<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == nums.length) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                    continue;
                }
                visited[i] = true;
                temp.push(nums[i]);
                backTrack(nums, visited, temp, res);
                temp.pop();
                visited[i] = false;
            }
        }
    }
}
