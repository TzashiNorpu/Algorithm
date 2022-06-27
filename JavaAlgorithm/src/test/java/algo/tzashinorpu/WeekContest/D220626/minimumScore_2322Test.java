package algo.tzashinorpu.WeekContest.D220626;

import org.junit.jupiter.api.Test;

class minimumScore_2322Test {

    @Test
    void minimumScore() {
        minimumScore_2322 ins = new minimumScore_2322();
        int[] nums = {1, 5, 5, 4, 11};
        int[][] edges = {{0, 1}, {1, 2}, {1, 3}, {3, 4}};
        System.out.println(ins.minimumScore(nums, edges));
    }
}