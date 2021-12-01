package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_304 {
    private int[][] matrix;

    /*public LeetCode_5_304(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += this.matrix[i][j];
            }
        }
        return sum;
    }*/
    public LeetCode_5_304(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        this.matrix = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                this.matrix[i][j] = this.matrix[i - 1][j] + this.matrix[i][j - 1] - this.matrix[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // 加了全 0 行和全 0 列
        row1++;
        row2++;
        col1++;
        col2++;
        return this.matrix[row2][col2] - this.matrix[row2][col1 - 1] - this.matrix[row1 - 1][col2] + this.matrix[row1 - 1][col1 - 1];
    }
}
