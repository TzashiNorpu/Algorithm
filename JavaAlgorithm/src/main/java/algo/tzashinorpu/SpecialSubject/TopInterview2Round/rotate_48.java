package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class rotate_48 {
    public void rotate(int[][] matrix) {
        /*
        m[i][j]->m[j][col-1-i]
        m[j][col-1-i]->m[col-1-i][col-1-j]
        m[col-1-i][col-1-j]->m[col-1-j][i]
        m[col-1-j][i]->m[i][j]
         */
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < (n + 1) / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = tmp;
            }
        }
    }
}
