package algo.tzashinorpu.DpPlan.GSSY.Path;

import algo.tzashinorpu.GSSY.Path.minFallingPathSum_1289;
import org.junit.jupiter.api.Test;

class minFallingPathSum_1289Test {

    @Test
    void minFallingPathSum2() {
        minFallingPathSum_1289 ins = new minFallingPathSum_1289();
        int[][] grid = {{-73, 61, 43, -48, -36}, {3, 30, 27, 57, 10}, {96, -76, 84, 59, -15}, {5, -49, 76, 31, -7}, {97, 91, 61, -46, 67}};
        System.out.println(ins.minFallingPathSum2(grid));
    }
}