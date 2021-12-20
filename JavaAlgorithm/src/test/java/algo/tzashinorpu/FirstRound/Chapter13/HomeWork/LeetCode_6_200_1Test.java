package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_6_200_1Test {

    @Test
    void numIslands() {
        LeetCode_6_200_1 ins = new LeetCode_6_200_1();
        char[][] grids1 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(ins.numIslands(grids1));

        char[][] grids2 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(ins.numIslands(grids2));

        char[][] grids3 = {
                {'1'}, {'1'},
        };
        System.out.println(ins.numIslands(grids3));

        char[][] grids4 = {
                {'1'}, {'0'}, {'1'}, {'0'}, {'1'}, {'1'}
        };
        System.out.println(ins.numIslands(grids4));
    }
}