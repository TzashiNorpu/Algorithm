package algo.tzashinorpu.Daily.CN;

import java.util.ArrayDeque;

public class highestPeak_1765 {
    public int[][] highestPeak(int[][] isWater) {
        // [0,0,1]
        // [1,0,0]
        // [0,0,0]
        int rows = isWater.length;
        int cols = isWater[0].length;
        int[][] dp = new int[rows][cols];
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isWater[i][j] == 1) {
                    queue.addLast(new int[]{i, j});
                }
                dp[i][j] = isWater[i][j] == 1 ? 0 : -1;
            }
        }
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] poll = queue.pollFirst();
            int x = poll[0];
            int y = poll[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dirs[i][0];
                int newY = y + dirs[i][1];
                if (newX < 0 || newX >= rows || newY < 0 || newY >= cols) continue;
                if (dp[newX][newY] != -1) continue;
                dp[newX][newY] = dp[x][y] + 1;
                queue.addLast(new int[]{newX, newY});
            }
        }
        return dp;
    }
}
