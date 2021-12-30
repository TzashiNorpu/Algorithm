package algo.tzashinorpu.SecondRound.Chapter11;

public class searchMatrix_074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // 二分
        int cols = matrix[0].length;
        for (int[] ints : matrix) {
            int l = 0, r = cols - 1;
            if (target >= ints[l] && target <= ints[r]) {
                while (l <= r) {
                    int mid = (l + r) / 2;
                    if (ints[mid] == target) {
                        return true;
                    }
                    if (target < ints[mid]) {
                        r = mid - 1;
                    }
                    if (target > ints[mid]) {
                        l = mid + 1;
                    }
                }
            }
        }
        return false;
    }
}
