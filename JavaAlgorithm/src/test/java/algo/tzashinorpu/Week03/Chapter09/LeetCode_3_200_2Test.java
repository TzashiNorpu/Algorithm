package algo.tzashinorpu.Week03.Chapter09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_3_200_2Test {

    @Test
    void numIslands() {
        LeetCode_3_200_2 instance = new LeetCode_3_200_2();
        char[][] grid = {{'1', '1', '0', '0', '0' },
                {'1', '1', '0', '0', '0' },
                {'0', '0', '1', '0', '0' },
                {'0', '0', '0', '1', '1' }
        };
        System.out.println(instance.numIslands(grid));
    }
}