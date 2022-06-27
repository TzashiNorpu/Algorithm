package algo.tzashinorpu.WeekContest.D220625;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countPairs_6106 {
    // 用一个变量 tot 维护前面求出的连通块的大小之和。设当前连通块的大小为  size，
    // 那么它对答案的贡献就是 size⋅tot
    /*
    Input: n = 7, edges = [[0,2],[0,5],[2,4],[1,6],[5,4]]
    Output: 14
    Explanation: There are 14 pairs of nodes that are unreachable from each other:
    [[0,1],[0,3],[0,6],[1,2],[1,3],[1,4],[1,5],[2,3],[2,6],[3,4],[3,5],[3,6],[4,6],[5,6]].
    Therefore, we return 14.
     */
    private List<Integer>[] g;
    private boolean[] visited;
    private int count;

    public long countPairs(int n, int[][] edges) {
        g = new ArrayList[n];
        Arrays.setAll(g, e -> new ArrayList<>());
        for (var e : edges) {
            int x = e[0];
            int y = e[1];
            g[x].add(y);
            g[y].add(x);
        }
        visited = new boolean[n];
        var ans = 0L;
        for (int i = 0, tot = 0; i < n; i++) {
            if (!visited[i]) {
                count = 0;
                dfs(i);
                ans += (long) count * tot;
                tot += count;
            }
        }
        return ans;
    }

    private void dfs(int x) {
        visited[x] = true;
        ++count;
        for (var y : g[x]) if (!visited[y]) dfs(y);
    }
}
