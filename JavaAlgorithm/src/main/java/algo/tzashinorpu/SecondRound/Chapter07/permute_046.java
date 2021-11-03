package algo.tzashinorpu.SecondRound.Chapter07;

import java.util.LinkedList;
import java.util.List;

public class permute_046 {
    /*输入：nums = [1,2,3]
    输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]*/
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        LinkedList<Integer> temp = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        backtrack(nums, visited, temp, res);
        return res;
    }

    private void backtrack(int[] nums, boolean[] visited, LinkedList<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == nums.length) {
            res.add(new LinkedList<>(temp));
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                temp.push(nums[i]);
                visited[i] = true;
                backtrack(nums, visited, temp, res);
                visited[i] = false;
                temp.pop();
            }
        }
    }
}
