package algo.tzashinorpu.SecondRound.Chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class robotSim_874Test {

    @Test
    void robotSim() {
        robotSim_874 ins = new robotSim_874();
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {{2, 4}};
        System.out.println(ins.robotSim(commands, obstacles));
    }
}