package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_221_1Test {

    @Test
    void maximalSquare() {
        LeetCode_5_221_1 ins = new LeetCode_5_221_1();
        char[][] m1 = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '1', '1', '1'}};
        System.out.println(ins.maximalSquare(m1));
        char[][] m2 = {{'1', '1'}, {'1', '1'}};
        System.out.println(ins.maximalSquare(m2));
        char[][] m3 = {{'1', '0'}, {'0', '0'}};
        System.out.println(ins.maximalSquare(m3));
    }
}