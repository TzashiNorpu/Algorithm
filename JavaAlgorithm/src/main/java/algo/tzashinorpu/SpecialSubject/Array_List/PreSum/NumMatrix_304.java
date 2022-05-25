package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

public class NumMatrix_304 {
    int[][] presum;

    public NumMatrix_304(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        presum = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            presum[i][1] = presum[i - 1][1] + matrix[i - 1][0];
        }
        for (int j = 1; j <= cols; j++) {
            presum[1][j] = presum[1][j - 1] + matrix[0][j - 1];
        }
        for (int i = 2; i <= rows; i++) {
            for (int j = 2; j <= cols; j++) {
                presum[i][j] = presum[i][j - 1] + presum[i - 1][j] - presum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return presum[row2 + 1][col2 + 1] - presum[row1][col2 + 1] - presum[row2 + 1][col1] + presum[row1][col1];
    }
}
