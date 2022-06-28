package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.ArrayList;
import java.util.List;

public class permute_46 {
    List<List<Integer>> res;

    /*
    Input: nums = [1,2,3]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     */
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        boolean[] visited = new boolean[n];
        dfs(nums, list, 0, n, visited);
        return res;
    }

    private void dfs(int[] nums, ArrayList<Integer> list, int level, int n, boolean[] visited) {
        if (level == n) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                list.add(nums[i]);
                visited[i] = true;
                dfs(nums, list, level + 1, n, visited);
                visited[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
