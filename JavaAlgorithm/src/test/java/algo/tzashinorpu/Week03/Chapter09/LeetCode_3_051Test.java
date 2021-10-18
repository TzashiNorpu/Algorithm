package algo.tzashinorpu.Week03.Chapter09;

import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode_3_051Test {

    @Test
    void solveNQueens() {
        LeetCode_3_051 instance = new LeetCode_3_051();
        List<List<String>> temp = instance.solveNQueens(4);
        System.out.println(temp);
    }
}