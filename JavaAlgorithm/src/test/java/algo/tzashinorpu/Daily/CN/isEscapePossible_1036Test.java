package algo.tzashinorpu.Daily.CN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isEscapePossible_1036Test {

    @Test
    void isEscapePossible() {
        isEscapePossible_1036 ins = new isEscapePossible_1036();
        int[] target1 = {0, 2};
        int[] source1 = {0, 0};
        int[][] blocked1 = {{0, 1}, {1, 0}};
        System.out.println(ins.isEscapePossible(blocked1, source1, target1));


        int[] target2 = {0, 999997};
        int[] source2 = {0, 2};
        int[][] blocked2 = {{0, 999991}, {0, 999993}, {0, 999996}, {1, 999996}, {1, 999997}, {1, 999998}, {1, 999999}};
        System.out.println(ins.isEscapePossible(blocked2, source2, target2));

    }
}