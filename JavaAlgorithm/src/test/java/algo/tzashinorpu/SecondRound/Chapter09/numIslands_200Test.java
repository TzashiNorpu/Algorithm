package algo.tzashinorpu.SecondRound.Chapter09;

import org.junit.jupiter.api.Test;

class numIslands_200Test {

    @Test
    void numIslands() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        numIslands_200 instance = new numIslands_200();
        System.out.println(instance.numIslands(grid));
    }
}