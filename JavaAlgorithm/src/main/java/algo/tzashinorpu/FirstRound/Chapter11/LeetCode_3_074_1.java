package algo.tzashinorpu.FirstRound.Chapter11;

public class LeetCode_3_074_1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length - 1;
        for (int i = 0; i < row; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][col]) {
                int l = 0;
                int r = col;
                while (l <= r) {
                    int mid = (l + r) / 2;
                    int temp = matrix[i][mid];
                    if (temp == target) {
                        return true;
                    }
                    if (temp < target) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
