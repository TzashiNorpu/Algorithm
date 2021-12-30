package algo.tzashinorpu.SecondRound.Chapter10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class robotSim_874Test {

    @Test
    void robotSim() {
        robotSim_874 ins = new robotSim_874();
        int[] commands1 = {4, -1, 4, -2, 4};
        int[][] obstacles1 = {{2, 4}};
        System.out.println(ins.robotSim(commands1, obstacles1));

        int[] commands2 = {4, -1, 3};
        int[][] obstacles2 = {};
        System.out.println(ins.robotSim(commands2, obstacles2));


        int[] commands3 = {6, -1, -1, 6};
        int[][] obstacles3 = {};
        System.out.println(ins.robotSim(commands3, obstacles3));
    }
}