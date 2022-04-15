package algo.tzashinorpu.ThirdRound.Chapter07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class permute_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<Integer> tmp = new ArrayDeque<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(res, tmp, visited, nums);
        return res;
    }

    private void backTrack(List<List<Integer>> res, ArrayDeque<Integer> tmp, boolean[] visited, int[] nums) {
        if (tmp.size() == nums.length) {
//            System.out.println(tmp);
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                tmp.offerLast(nums[i]);
                visited[i] = true;
                backTrack(res, tmp, visited, nums);
                visited[i] = false;
                tmp.pollLast();
            }
        }
    }
}
