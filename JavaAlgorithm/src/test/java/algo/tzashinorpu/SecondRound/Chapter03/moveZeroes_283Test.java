package algo.tzashinorpu.SecondRound.Chapter03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class moveZeroes_283Test {

    @Test
    void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes_283 ins = new moveZeroes_283();
        ins.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{1};
        ins.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}