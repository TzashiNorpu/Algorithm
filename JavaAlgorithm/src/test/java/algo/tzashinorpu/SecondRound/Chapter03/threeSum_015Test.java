package algo.tzashinorpu.SecondRound.Chapter03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class threeSum_015Test {

    @Test
    void threeSum() {
        threeSum_015 ins = new threeSum_015();
        int[] ints = {-1, 0, 1, 2, -1, -4};
        System.out.println(ins.threeSum(ints));
    }
}