package algo.tzashinorpu.SecondRound.Chapter03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxArea_011Test {

    @Test
    void maxArea() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea_011 ins = new maxArea_011();
        System.out.println(ins.maxArea(heights));
        heights = new int[]{1, 1};
        System.out.println(ins.maxArea(heights));
        heights = new int[]{4, 3, 2, 1, 4};
        System.out.println(ins.maxArea(heights));
        heights = new int[]{1, 2, 1};
        System.out.println(ins.maxArea(heights));
    }
}