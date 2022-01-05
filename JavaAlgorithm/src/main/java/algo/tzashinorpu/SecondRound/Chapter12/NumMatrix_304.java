package algo.tzashinorpu.SecondRound.Chapter12;

public class NumMatrix_304 {
    private int[][] ijSums;

    public NumMatrix_304(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        this.ijSums = new int[rows][cols];
        ijSums[0][0] = matrix[0][0];
        for (int i = 1; i < rows; i++) {
            ijSums[i][0] = matrix[i][0] + ijSums[i - 1][0];
        }
        for (int i = 1; i < cols; i++) {
            ijSums[0][i] = ijSums[0][i - 1] + matrix[0][i];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                ijSums[i][j] = ijSums[i - 1][j] + ijSums[i][j - 1] + matrix[i][j] - ijSums[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // area(0,0,row2,col2) - area(0,0,row2,col1-1) - area(0,0,row1-1,col2) + area(0,0,row1-1,col1-1)
        if (row1 == 0 && col1 == 0) {
            return this.ijSums[row2][col2];
        }
        if (row1 == 0) {
            return this.ijSums[row2][col2] - this.ijSums[row2][col1 - 1];
        }
        if (col1 == 0) {
            return this.ijSums[row2][col2] - this.ijSums[row1 - 1][col2];
        }
        return this.ijSums[row2][col2] - this.ijSums[row2][col1 - 1] - this.ijSums[row1 - 1][col2] + this.ijSums[row1 - 1][col1 - 1];
    }
}
