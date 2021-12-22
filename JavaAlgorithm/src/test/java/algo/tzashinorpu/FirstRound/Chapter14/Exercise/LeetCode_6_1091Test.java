package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_6_1091Test {

    @Test
    void shortestPathBinaryMatrix() {
        LeetCode_6_1091 ins1 = new LeetCode_6_1091();
        int[][] grid1 = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}
        };
        System.out.println(ins1.shortestPathBinaryMatrix(grid1));
        LeetCode_6_1091 ins2 = new LeetCode_6_1091();
        int[][] grid2 = {{0, 1}, {1, 0}};
        System.out.println(ins2.shortestPathBinaryMatrix(grid2));
        LeetCode_6_1091 ins3 = new LeetCode_6_1091();
        int[][] grid3 = {
                {0, 1, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 1, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 1, 0}
        };
        System.out.println(ins3.shortestPathBinaryMatrix(grid3));
    }
}