package algo.tzashinorpu.FirstRound.Chapter09;

import org.junit.jupiter.api.Test;

class LeetCode_3_200_1Test {

    @Test
    void numIslands() {
        char[][] grid1 = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        LeetCode_3_200_1 ins = new LeetCode_3_200_1();
        System.out.printf("number of island is = %d\n", ins.numIslands(grid1));
        char[][] grid2 = {{'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}

        };
        System.out.printf("number of island is = %d\n", ins.numIslands(grid2));
    }
}