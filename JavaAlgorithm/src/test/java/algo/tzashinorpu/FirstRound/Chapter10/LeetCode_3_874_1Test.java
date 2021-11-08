package algo.tzashinorpu.FirstRound.Chapter10;

import org.junit.jupiter.api.Test;

class LeetCode_3_874_1Test {

    @Test
    void robotSim() {
        int[] commands = {6, -1, -1, 6};
        int[][] obstacles = {};
        LeetCode_3_874_1 instance = new LeetCode_3_874_1();
        System.out.println(instance.robotSim(commands, obstacles));
    }
}