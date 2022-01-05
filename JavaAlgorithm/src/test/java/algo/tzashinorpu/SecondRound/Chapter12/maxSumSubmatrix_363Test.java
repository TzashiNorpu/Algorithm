package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxSumSubmatrix_363Test {

    @Test
    void maxSumSubmatrix() {
        maxSumSubmatrix_363 ins = new maxSumSubmatrix_363();
        int[][] matrix = {{1, 0, 1}, {0, -2, 3}};
        int k = 2;
        System.out.println(ins.maxSumSubmatrix(matrix, k));
    }
}