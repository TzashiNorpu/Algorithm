package algo.tzashinorpu.ThirdRound.Chapter07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class combine_77 {
    public List<List<Integer>> combine(int n, int k) {
        // k of [1->n]
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int level = 0;
        ArrayDeque<Integer> choose = new ArrayDeque<Integer>();
        backTrack(res, n, k, visited, choose, level);
        return res;
    }

    private void backTrack(List<List<Integer>> res, int n, int k, boolean[] visited, ArrayDeque<Integer> choose, int level) {
        if (choose.size() == k) {
//            System.out.println(choose);
            res.add(new ArrayList<>(choose));
            return;
        }
        for (int i = level; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                choose.offerLast(i + 1);
                backTrack(res, n, k, visited, choose, i + 1);
                choose.pollLast();
                visited[i] = false;
            }
        }

        /*for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                choose.offerLast(i + 1);
                recursive(res, n, k, visited, choose, level + 1);
                choose.pollLast();
                visited[i] = false;
            }
        }*/
    }
}
