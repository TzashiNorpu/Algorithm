package algo.tzashinorpu.DpPlan.GSSY.Path;

import java.util.List;

public class pathsWithMaxScore_1301 {
    public int[] pathsWithMaxScore(List<String> board) {
        /*
        "E12"
        "12X"
        "2XS"
        */
        int MOD = 1000000007;
        int size = board.size();
        int[] scoreDp = new int[size * size];
        int[] countDp = new int[size * size];
        char[][] chars = new char[size][size];
        for (int i = 0; i < size; i++) {
            chars[i] = board.get(i).toCharArray();
        }
        // 向上、向左或者左上
        // 最后一列
        for (int i = size - 1; i >= 0; i--) {
            int point = getPoint(i, size - 1, size);
            char c = chars[i][size - 1];
            if (c == 'S') {
                scoreDp[point] = 0;
                countDp[point] = 1;
            } else {
                int preScore = scoreDp[getPoint(i + 1, size - 1, size)];
                scoreDp[point] = (c == 'X' ? -1 : (preScore == -1 ? -1 : preScore + (c - '0')));
                countDp[point] = (c == 'X' ? 0 : (preScore == -1 ? 0 : 1));
            }
        }
        // 最后一行
        for (int i = size - 1; i >= 0; i--) {
            int point = getPoint(size - 1, i, size);
            char c = chars[size - 1][i];
            if (c == 'S') {
                scoreDp[point] = 0;
                countDp[point] = 1;
            } else {
                int preScore = scoreDp[getPoint(size - 1, i + 1, size)];
                scoreDp[point] = (c == 'X' ? -1 : (preScore == -1 ? -1 : preScore + (c - '0')));
                countDp[point] = (c == 'X' ? 0 : (preScore == -1 ? 0 : 1));
            }
        }

        for (int i = size - 2; i >= 0; i--) {
            for (int j = size - 2; j >= 0; j--) {
                int rightPoint = getPoint(i, j + 1, size);
                int downPoint = getPoint(i + 1, j, size);
                int rightDownPoint = getPoint(i + 1, j + 1, size);
                int point = getPoint(i, j, size);
                char c = chars[i][j];
                int right = scoreDp[rightPoint];
                int down = scoreDp[downPoint];
                int rightDown = scoreDp[rightDownPoint];
                if (c == 'X' || (right == -1 && down == -1 && rightDown == -1)) {
                    scoreDp[point] = -1;
                    countDp[point] = 0;
                } else {
                    int max = Math.max(right, Math.max(down, rightDown));
                    int cnt = maxCount(max, rightPoint, rightDownPoint, downPoint, scoreDp, countDp);
                    if (c == 'E') {
                        scoreDp[point] = max;
                    } else {
                        scoreDp[point] = max + (c - '0');
                    }
                    countDp[point] = cnt % MOD;
                }
            }
        }
        return scoreDp[0] == -1 ? new int[]{0, 0} : new int[]{scoreDp[0], countDp[0]};
    }

    private int maxCount(int max, int rightPoint, int rightDownPoint, int downPoint, int[] scoreDp, int[] countDp) {
        int cnt = 0;
        if (max == scoreDp[rightPoint]) cnt += countDp[rightPoint];
        if (max == scoreDp[rightDownPoint]) cnt += countDp[rightDownPoint];
        if (max == scoreDp[downPoint]) cnt += countDp[downPoint];
        return cnt;
    }


    private int getPoint(int x, int y, int cols) {
        return x * cols + y;
    }
}
