package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

class LeetCode_5_304Test {

    @Test
    void sumRegion() {
        int[][] m = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        LeetCode_5_304 ins = new LeetCode_5_304(m);
        System.out.println(ins.sumRegion(2, 1, 4, 3));
        System.out.println(ins.sumRegion(1, 1, 2, 2));
        System.out.println(ins.sumRegion(1, 2, 2, 4));
    }
}