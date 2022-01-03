package algo.tzashinorpu.Daily.COM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_997Test {

    @Test
    void findJudge() {
        LeetCode_997 ins = new LeetCode_997();
        int[][] trusts1 = {{1, 3}, {2, 3}};
        System.out.println(ins.findJudge(3, trusts1));

        int[][] trusts2 = {};
        System.out.println(ins.findJudge(1, trusts2));

        int[][] trusts3 = {};
        System.out.println(ins.findJudge(2, trusts3));
    }
}