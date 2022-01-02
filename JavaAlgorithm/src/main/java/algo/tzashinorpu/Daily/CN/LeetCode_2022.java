package algo.tzashinorpu.Daily.CN;

public class LeetCode_2022 {
    public int[][] construct2DArray1(int[] original, int m, int n) {
        int length = original.length;
        if (length != m * n) {
            return new int[][]{};
        }
        int[][] res = new int[m][n];
        for (int i = 0; i < length; i++) {
            res[i / n][i % n] = original[i];
        }
        return res;
    }

    public int[][] construct2DArray2(int[] original, int m, int n) {
        int length = original.length;
        if (length != m * n) {
            return new int[][]{};
        }
        int[][] res = new int[m][n];
        for (int i = 0, index = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = original[index++];
            }
        }
        return res;
    }
}
