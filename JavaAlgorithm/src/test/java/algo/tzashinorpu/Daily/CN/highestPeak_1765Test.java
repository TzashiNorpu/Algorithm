package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class highestPeak_1765Test {

    @Test
    void highestPeak() {
        highestPeak_1765 ins = new highestPeak_1765();
        int[][] isWater = {{0, 1}, {0, 0}};
        System.out.println(Arrays.deepToString(ins.highestPeak(isWater)));
    }
}