package algo.tzashinorpu.WeekContest.D1226;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class E5965Test {

    @Test
    void getDistances() {
        E5965 ins = new E5965();
        int[] arr = {2, 1, 3, 1, 2, 3, 3};
        System.out.println(Arrays.toString(ins.getDistances(arr)));
    }

}