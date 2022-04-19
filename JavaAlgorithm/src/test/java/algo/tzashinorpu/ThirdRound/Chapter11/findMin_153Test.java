package algo.tzashinorpu.ThirdRound.Chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findMin_153Test {

    @Test
    void findMin() {
        findMin_153 ins = new findMin_153();
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(ins.findMin(nums));
    }
}