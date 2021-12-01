package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

class LeetCode_5_363Test {

    @Test
    void maxSumSubmatrix() {
        LeetCode_5_363 ins = new LeetCode_5_363();

        int[][] m1 = {{1, 0, 1}, {0, -2, 3}};
        int k1 = 2;
        System.out.println(ins.maxSumSubmatrix1(m1, k1));
        System.out.println(ins.maxSumSubmatrix2(m1, k1));

        int[][] m2 = {{2, 2, -1}};
        int k2 = 3;
        System.out.println(ins.maxSumSubmatrix1(m2, k2));
        System.out.println(ins.maxSumSubmatrix2(m2, k2));

        int[][] m3 = {{5, -4, -3, 4}, {-3, -4, 4, 5}, {5, 1, 5, -4}};
        int k3 = 3;
        System.out.println(ins.maxSumSubmatrix1(m3, k3));
        System.out.println(ins.maxSumSubmatrix2(m3, k3));
    }
}