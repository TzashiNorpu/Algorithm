package algo.tzashinorpu.SecondRound.Chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class uniquePathsIII_980Test {

    @Test
    void uniquePathsIII() {
        uniquePathsIII_980 ins = new uniquePathsIII_980();
        int[][] grid = {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        System.out.println(ins.uniquePathsIII(grid));
    }
}