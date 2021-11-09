package algo.tzashinorpu.FirstRound.Chapter11;

import org.junit.jupiter.api.Test;

class LeetCode_3_074_1Test {

    @Test
    void searchMatrix() {
        int[][] matrix = {
                {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        };
        int target = 12;
        LeetCode_3_074_1 ins = new LeetCode_3_074_1();
        System.out.println(ins.searchMatrix(matrix, target));
    }
}