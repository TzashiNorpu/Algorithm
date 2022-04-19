package algo.tzashinorpu.ThirdRound.Chapter11;

public class searchMatrix_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            int l = 0, r = row.length - 1;
            int mid;
            if (target < row[l]) return false;
            if (target <= row[r]) {
                while (l <= r) {
                    mid = (l + r) / 2;
                    if (row[mid] == target) {
                        return true;
                    }
                    if (row[mid] > target) {
                        r = mid - 1;
                    } else {
                        // row[mid] <= target
                        l = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}
