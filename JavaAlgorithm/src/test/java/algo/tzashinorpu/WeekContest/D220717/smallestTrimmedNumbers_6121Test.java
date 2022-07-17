package algo.tzashinorpu.WeekContest.D220717;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class smallestTrimmedNumbers_6121Test {

    @Test
    void smallestTrimmedNumbers() {
        String[] nums = {"24", "37", "96", "04"};
        int[][] queries = {{2, 1}, {2, 2}};
        smallestTrimmedNumbers_6121 ins = new smallestTrimmedNumbers_6121();
        System.out.println(Arrays.toString(ins.smallestTrimmedNumbers(nums, queries)));

    }
}