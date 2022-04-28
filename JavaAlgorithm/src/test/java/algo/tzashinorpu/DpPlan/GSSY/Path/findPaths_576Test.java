package algo.tzashinorpu.DpPlan.GSSY.Path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findPaths_576Test {

    @Test
    void findPaths() {
        findPaths_576 ins = new findPaths_576();
        int startColumn = 0;
        int startRow = 0;
        int maxMove = 2;
        int m = 2;
        int n = 2;
        System.out.println(ins.findPaths(m, n, maxMove, startRow, startColumn));
    }
}