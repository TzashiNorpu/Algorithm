package algo.tzashinorpu.WeekContest.D0611;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class successfulPairs_6096Test {

    @Test
    void successfulPairs() {
        successfulPairs_6096 ins = new successfulPairs_6096();
        System.out.println(Arrays.toString(ins.successfulPairs(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7}, 25)));
    }
}