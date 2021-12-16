package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_621_1Test {

    @Test
    void leastInterval() {
        LeetCode_5_621_1 ins = new LeetCode_5_621_1();
        char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int n = 2;
        System.out.println(ins.leastInterval(tasks, n));
    }
}