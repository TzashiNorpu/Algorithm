package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_980Test {

    @Test
    void uniquePathsIII() {
        LeetCode_5_980 ins1 = new LeetCode_5_980();
        int[][] grid1 = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        System.out.println(ins1.uniquePathsIII(grid1));

        LeetCode_5_980 ins2 = new LeetCode_5_980();
        int[][] grid2 = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        System.out.println(ins2.uniquePathsIII(grid2));

        LeetCode_5_980 ins3 = new LeetCode_5_980();
        int[][] grid3 = {{0, 1}, {2, 0}};
        System.out.println(ins3.uniquePathsIII(grid3));
    }
}