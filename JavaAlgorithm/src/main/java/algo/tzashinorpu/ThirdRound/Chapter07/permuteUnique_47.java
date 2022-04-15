package algo.tzashinorpu.ThirdRound.Chapter07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteUnique_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        ArrayDeque<Integer> tmp = new ArrayDeque<>();
        Arrays.sort(nums);
        backTrack(res, tmp, visited, nums);
        return res;
    }

    private void backTrack(List<List<Integer>> res, ArrayDeque<Integer> tmp, boolean[] visited, int[] nums) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
                tmp.offerLast(nums[i]);
                visited[i] = true;
                backTrack(res, tmp, visited, nums);
                visited[i] = false;
                tmp.pollLast();
            }
        }
    }
}
