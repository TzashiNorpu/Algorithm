package algo.tzashinorpu.SpecialSubject.Graph;

import java.util.ArrayList;
import java.util.List;

public class allPathsSourceTarget_797 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        traverse(graph, 0, path);
        return res;
    }

    private void traverse(int[][] graph, int s, List<Integer> path) {
        path.add(s);
        int n = graph.length;
        if (s == n - 1) {
            res.add(new ArrayList<>(path));
        }
        for (int v : graph[s]) {
            traverse(graph, v, path);
        }
        path.remove(path.size() - 1);
    }
}
