package algo.tzashinorpu.SecondRound.Chapter05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class twoSum_001Test {

    @Test
    void twoSum() {
        twoSum_001 instance = new twoSum_001();
        int[] ints = {2, 7, 11, 15};
        System.out.println(Arrays.toString(instance.twoSum(ints, 9)));
    }
}