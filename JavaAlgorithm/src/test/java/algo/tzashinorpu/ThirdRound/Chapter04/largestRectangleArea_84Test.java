package algo.tzashinorpu.ThirdRound.Chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class largestRectangleArea_84Test {

    @Test
    void largestRectangleArea() {
        largestRectangleArea_84 ins = new largestRectangleArea_84();
        int[] nums = {2, 1, 5, 6, 2, 3};
        System.out.println(ins.largestRectangleArea(nums));
    }
}