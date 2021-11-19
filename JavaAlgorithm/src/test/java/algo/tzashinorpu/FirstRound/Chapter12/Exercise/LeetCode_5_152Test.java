package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

import algo.tzashinorpu.FirstRound.Chapter12.Exercise.LeetCode_5_152;
import org.junit.jupiter.api.Test;

class LeetCode_5_152Test {

    @Test
    void maxProduct() {
        LeetCode_5_152 ins = new LeetCode_5_152();
        int[] ints1 = {-2, 2, 3, 4, -5};
        System.out.println(ins.maxProduct1(ints1));
        int[] ints2 = {2, 2, 3};
        System.out.println(ins.maxProduct1(ints2));
    }

    @Test
    void maxProduct2() {
        LeetCode_5_152 ins = new LeetCode_5_152();
        int[] ints1 = {-2, 2, 3, 4, -5};
        System.out.println(ins.maxProduct2(ints1));
        int[] ints2 = {2, 2, 3};
        System.out.println(ins.maxProduct2(ints2));
    }

    @Test
    void maxProduct3() {
        LeetCode_5_152 ins = new LeetCode_5_152();
        int[] ints1 = {-2, 2, 3, 4, -5};
        System.out.println(ins.maxProduct3(ints1));
        int[] ints2 = {-4, -3, -2};
        System.out.println(ins.maxProduct3(ints2));
    }
}