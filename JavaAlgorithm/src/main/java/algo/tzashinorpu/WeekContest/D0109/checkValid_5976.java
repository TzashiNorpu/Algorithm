package algo.tzashinorpu.WeekContest.D0109;

import java.util.Arrays;

public class checkValid_5976 {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int[][] m1 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[j][i] = matrix[i][j];
            }
        }
        for (int[] ints : matrix) {
            Arrays.sort(ints);
            for (int j = 0; j < n; j++) {
                if (ints[j] != j + 1) {
                    return false;
                }
            }
        }
        for (int[] ints : m1) {
            Arrays.sort(ints);
            for (int j = 0; j < n; j++) {
                if (ints[j] != j + 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
