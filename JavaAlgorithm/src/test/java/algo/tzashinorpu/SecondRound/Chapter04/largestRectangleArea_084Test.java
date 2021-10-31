package algo.tzashinorpu.SecondRound.Chapter04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class largestRectangleArea_084Test {

    @Test
    void largestRectangleArea() {
        largestRectangleArea_084 ins = new largestRectangleArea_084();
        int[] ints1 = {2, 1, 5, 6, 2, 3};
        System.out.println(ins.largestRectangleArea(ints1));
        int[] ints2 = {2, 4};
        System.out.println(ins.largestRectangleArea(ints2));
    }
}