package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_363 {
    public int maxSumSubmatrix1(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] sum = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
        int res = Integer.MIN_VALUE;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                for (int l = i; l <= rows; l++) {
                    for (int m = j; m <= cols; m++) {
                        int area = sum[l][m] - sum[l][j - 1] - sum[i - 1][m] + sum[i - 1][j - 1];
                        if (area <= k) {
                            res = Math.max(res, area);
                        }
                    }
                }
            }
        }
        return res;
    }

    public int maxSumSubmatrix2(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int res = Integer.MIN_VALUE;
        // 枚举左边界
        for (int colLeft = 0; colLeft < cols; colLeft++) {
            // 左边界改变时重新计算
            int[] colSum = new int[rows];
            // 枚举右边界
            for (int colRight = colLeft; colRight < cols; colRight++) {
                // 累计每一行的左右边界元素和
                for (int i = 0; i < rows; i++) {
                    colSum[i] += matrix[i][colRight];
                }
                // 不大于 k 的连续子数组和
                res = Math.max(res, maxArrayK1(colSum, k));
            }
        }
        return res;
    }

    // 不大于 k 的连续子数组和
    private int maxArrayK1(int[] colSum, int k) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < colSum.length; i++) {
            int sum = 0;
            for (int j = i; j < colSum.length; j++) {
                sum += colSum[j];
                if (sum <= k) {
                    if (sum == k) {
                        return k;
                    }
                    res = Math.max(res, sum);
                }
            }
        }
        return res;
    }

    // 不大于 k 的连续子数组和
    private int maxArrayK2(int[] colSum, int k) {
        int rollSum = colSum[0], rollMax = rollSum;
        // O(rows)
        for (int i = 1; i < colSum.length; i++) {
            if (rollSum > 0) rollSum += colSum[i];
            else rollSum = colSum[i];
            if (rollSum > rollMax) rollMax = rollSum;
        }
        if (rollMax <= k) return rollMax;
        // O(rows ^ 2)
        int max = Integer.MIN_VALUE;
        for (int l = 0; l < colSum.length; l++) {
            int sum = 0;
            for (int r = l; r < colSum.length; r++) {
                sum += colSum[r];
                if (sum > max && sum <= k) max = sum;
                if (max == k) return k; // 尽量提前
            }
        }
        return max;
    }
}
