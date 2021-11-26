package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_063_1Test {

    @Test
    void uniquePathsWithObstacles() {
        LeetCode_5_063_1 ins = new LeetCode_5_063_1();
        int[][] obstacleGrid1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(ins.uniquePathsWithObstacles(obstacleGrid1));

        int[][] obstacleGrid2 = {{0, 1}, {0, 0}};
        System.out.println(ins.uniquePathsWithObstacles(obstacleGrid2));

        int[][] obstacleGrid3 = {{0, 0}, {0, 1}};
        System.out.println(ins.uniquePathsWithObstacles(obstacleGrid3));

        int[][] obstacleGrid4 = {{0, 0}, {1, 1}, {0, 0}};
        System.out.println(ins.uniquePathsWithObstacles(obstacleGrid4));
    }
}