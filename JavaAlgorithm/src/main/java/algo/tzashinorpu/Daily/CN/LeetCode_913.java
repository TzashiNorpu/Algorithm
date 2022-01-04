package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;

public class LeetCode_913 {
    /**
     * 平局
     */
    private static final int DRAW = 0;
    /**
     * 老鼠赢
     */
    private static final int MOUSE_WIN = 1;
    /**
     * 猫赢
     */
    private static final int CAT_WIN = 2;

    public int catMouseGame(int[][] graph) {
        int n = graph.length;
        int[][][] memo = new int[n][n][2 * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
        return dfs(graph, n, memo, 2, 1, 0);
    }

    private int dfs(int[][] graph, int n, int[][][] memo, int catPos, int mousePos, int turns) {
        if (turns >= 2 * n) {
            return DRAW;
        }
        if (memo[catPos][mousePos][turns] != -1) {
            return memo[catPos][mousePos][turns];
        }
        if (mousePos == 0) {
            return memo[catPos][mousePos][turns] = MOUSE_WIN;
        }
        if (catPos == mousePos) {
            return memo[catPos][mousePos][turns] = CAT_WIN;
        }
        if (turns % 2 == 0) {
            int ans = CAT_WIN;
            for (int nextPos : graph[mousePos]) {
                int nextAns = dfs(graph, n, memo, catPos, nextPos, turns + 1);
                if (nextAns == MOUSE_WIN) {
                    return memo[catPos][mousePos][turns] = MOUSE_WIN;
                }
                if (nextAns == DRAW) {
                    ans = DRAW;
                }
            }
            return memo[catPos][mousePos][turns] = ans;
        } else {
            int ans = MOUSE_WIN;
            for (int nextPos : graph[catPos]) {
                if (nextPos != 0) {
                    int nextAns = dfs(graph, n, memo, nextPos, mousePos, turns + 1);
                    if (nextAns == CAT_WIN) {
                        return memo[catPos][mousePos][turns] = CAT_WIN;
                    }
                    if (nextAns == DRAW) {
                        ans = DRAW;
                    }
                }
            }
            return memo[catPos][mousePos][turns] = ans;
        }
    }
}
