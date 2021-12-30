package algo.tzashinorpu.SecondRound.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class searchMatrix_074Test {

    @Test
    void searchMatrix() {
        searchMatrix_074 ins = new searchMatrix_074();
        int[][] matrix1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target1 = 13;
        System.out.println(ins.searchMatrix(matrix1, target1));
    }
}