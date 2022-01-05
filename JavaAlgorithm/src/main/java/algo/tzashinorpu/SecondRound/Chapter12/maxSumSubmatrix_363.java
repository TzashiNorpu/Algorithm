package algo.tzashinorpu.SecondRound.Chapter12;

public class maxSumSubmatrix_363 {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] sum = new int[rows][cols];
        sum[0][0] = matrix[0][0];
        for (int i = 1; i < rows; i++) {
            sum[i][0] = sum[i - 1][0] + matrix[i][0];
        }
        for (int i = 1; i < cols; i++) {
            sum[0][i] = sum[0][i - 1] + matrix[0][i];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i][j];
            }
        }
        int res = Integer.MIN_VALUE;
        for (int startX = 0; startX < rows; startX++) {
            for (int startY = 0; startY < cols; startY++) {
                for (int endX = startX; endX < rows; endX++) {
                    for (int endY = startY; endY < cols; endY++) {
                        int area;
                        if (startX == 0 && startY == 0) {
                            area = sum[endX][endY];
                        } else if (startX == 0) {
                            area = sum[endX][endY] - sum[endX][endY - 1];
                        } else if (startY == 0) {
                            area = sum[endX][endY] - sum[startX - 1][endY];
                        } else {
                            area = sum[endX][endY] - sum[startX - 1][endY] - sum[endX][startY - 1] + sum[startX - 1][startY - 1];
                        }
                        if (area <= k) {
                            res = Math.max(res, area);
                        }
                    }
                }
            }
            if (res == k) {
                break;
            }
        }
        return res;
    }
}
