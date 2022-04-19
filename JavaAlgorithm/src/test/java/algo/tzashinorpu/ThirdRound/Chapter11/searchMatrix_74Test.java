package algo.tzashinorpu.ThirdRound.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class searchMatrix_74Test {

    @Test
    void searchMatrix() {
        searchMatrix_74 ins = new searchMatrix_74();
        int target = 20;
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 36}};
        System.out.println(ins.searchMatrix(matrix, target));
    }
}