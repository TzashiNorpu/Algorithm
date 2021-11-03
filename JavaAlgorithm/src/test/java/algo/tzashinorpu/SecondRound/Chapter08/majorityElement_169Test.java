package algo.tzashinorpu.SecondRound.Chapter08;

import org.junit.jupiter.api.Test;

class majorityElement_169Test {

    @Test
    void majorityElement1() {
        int[] ints = new int[]{2, 2, 1, 1, 1, 2, 2};
        majorityElement_169 instance = new majorityElement_169();
        System.out.println(instance.majorityElement1(ints));
    }

    @Test
    void majorityElement2() {
        int[] ints = new int[]{2, 2, 1, 1, 1, 2, 2};
        majorityElement_169 instance = new majorityElement_169();
        System.out.println(instance.majorityElement2(ints));
    }
}