package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_064_1Test {

    @Test
    void minPathSum() {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        LeetCode_5_064_1 ins = new LeetCode_5_064_1();
        System.out.println(ins.minPathSum(grid));
    }
}