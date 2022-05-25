package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumMatrix_304Test {

    @Test
    void sumRegion() {
        int[][] m = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix_304 ins = new NumMatrix_304(m);
        System.out.println(ins.sumRegion(1, 1, 2, 2));
        System.out.println(ins.sumRegion(2, 1, 4, 3));
        System.out.println(ins.sumRegion(1, 2, 2, 4));
    }
}