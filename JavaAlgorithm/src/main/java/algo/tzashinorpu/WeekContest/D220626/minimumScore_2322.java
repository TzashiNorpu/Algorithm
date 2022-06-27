package algo.tzashinorpu.WeekContest.D220626;

import java.util.ArrayList;
import java.util.List;

public class minimumScore_2322 {
    List<Integer>[] g;
    int[] nums, xor, in, out;
    int clock;

    /*
    Input: nums = [1,5,5,4,11], edges = [[0,1],[1,2],[1,3],[3,4]]
    Output: 9
    Explanation: The diagram above shows a way to make a pair of removals.
            - The 1st component has nodes [1,3,4] with values [5,4,11]. Its XOR value is 5 ^ 4 ^ 11 = 10.
            - The 2nd component has node [0] with value [1]. Its XOR value is 1 = 1.
            - The 3rd component has node [2] with value [5]. Its XOR value is 5 = 5.
    The score is the difference between the largest and smallest XOR value which is 10 - 1 = 9.
    It can be shown that no other pair of removals will obtain a smaller score than 9.
    */

    public int minimumScore(int[] nums, int[][] edges) {
        var n = nums.length;
        g = new ArrayList[n];
        for (var i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (var e : edges) {
            int x = e[0], y = e[1];
            g[x].add(y);
            g[y].add(x);
        }
        this.nums = nums;
        xor = new int[n];
        in = new int[n];
        out = new int[n];
        // 以 0 为根，DFS 这棵树，在求出时间戳的同时，求出每棵以 x 为根的子树的异或和 xor[x]
        dfs(0, -1);

        var ans = Integer.MAX_VALUE;
        // 用 O(n^2) 的时间枚举要删除的两条边
        for (var i = 2; i < n; ++i)
            for (int j = 1; j < i; ++j) {
                int x, y, z;
                if (in[i] < in[j] && in[j] <= out[i]) { // i 是 j 的祖先节点
                    x = xor[j];
                    y = xor[i] ^ x;
                    z = xor[0] ^ xor[i];
                } else if (in[j] < in[i] && in[i] <= out[j]) { // j 是 i 的祖先节点
                    x = xor[i];
                    y = xor[j] ^ x;
                    z = xor[0] ^ xor[j];
                } else { // 删除的两条边分别属于两颗不相交的子树
                    x = xor[i];
                    y = xor[j];
                    z = xor[0] ^ x ^ y;
                }
                ans = Math.min(ans, Math.max(Math.max(x, y), z) - Math.min(Math.min(x, y), z));
                if (ans == 0) return 0; // 提前退出
            }
        return ans;
    }

    private void dfs(int x, int fa) {
        in[x] = ++clock;
        xor[x] = nums[x];
        for (var y : g[x])
            if (y != fa) {
                dfs(y, x);
                xor[x] ^= xor[y];
            }
        out[x] = clock;
    }
}
