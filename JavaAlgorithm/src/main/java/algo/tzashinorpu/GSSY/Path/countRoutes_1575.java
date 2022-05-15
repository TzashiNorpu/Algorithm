package algo.tzashinorpu.GSSY.Path;

import java.util.Arrays;

public class countRoutes_1575 {
    // cache[i][fuel] 代表从位置 i 出发，当前剩余的油量为 fuel 的前提下，到达目标位置[finish]的「路径数量」
    private int[][] cache;
    private int MOD = 1000000007;

    public int countRoutes1(int[] locations, int start, int finish, int fuel) {
        int len = locations.length;
        cache = new int[len][fuel + 1];
        for (int i = 0; i < len; i++) {
            Arrays.fill(cache[i], -1);
        }
        return dfs(len, start, finish, fuel, locations);
    }

    private int dfs(int len, int pos, int finish, int fuel, int[] locations) {
        // terminator
        // memorized
        if (cache[pos][fuel] != -1) {
            return cache[pos][fuel];
        }
        // 油量为0 不在 finish 位置
//        if (fuel == 0 && pos != finish) return cache[pos][0] = 0;
        if (fuel == 0 && pos != finish) {
            return cache[pos][0] = 0;
        }

        // 油量不为0 但是到不了其他任意地方
        /*if (fuel != 0) {
            boolean next = false;
            for (int i = 0; i < len; i++) {
                // 可以去下一个位置
                if (i != pos) {
                    if (Math.abs(locations[i] - locations[pos]) <= fuel) {
                        next = true;
                        break;
                    }
                }
            }
            // 油量不为0 去不了其他地方 但是就在finish
            if (!next) return cache[pos][fuel] = (pos == finish ? 1 : 0);
        }*/
        // 如果我们在某个位置 pos 出发,不能一步到达目的地,将永远无法到达目的地
        if (fuel != 0) {
            int need = Math.abs(locations[finish] - locations[pos]);
            if (need > fuel) return cache[pos][fuel] = pos == finish ? 1 : 0;
        }
        // drill down
        int sum = pos == finish ? 1 : 0;
        for (int i = 0; i < len; i++) {
            if (i != pos) {
                int need = Math.abs(locations[i] - locations[pos]);
                if (fuel >= need) {
                    sum += dfs(len, i, finish, fuel - need, locations);
                    sum %= MOD;
                }
            }
        }
        return cache[pos][fuel] = sum;
    }


    public int countRoutes2(int[] locations, int start, int finish, int fuel) {
        int len = locations.length;
        int[][] dp = new int[len][fuel + 1];
        for (int i = 0; i <= fuel; i++) {
            dp[finish][i] = 1;
        }
        for (int i = 0; i <= fuel; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    if (j != k) {
                        int need = Math.abs(locations[j] - locations[k]);
                        if (i >= need) {
                            dp[j][i] += dp[k][i - need];
                            dp[j][i] %= 1000000007;
                        }
                    }
                }
            }
        }
        return dp[start][fuel];
    }
}
