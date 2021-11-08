package algo.tzashinorpu.FirstRound.Chapter10;

import org.junit.jupiter.api.Test;

class LeetCode_3_455_1Test {

    @Test
    void findContentChildren() {
        int[] g = {10, 9, 8, 7};
        int[] s = {5, 6, 7, 8};
        LeetCode_3_455_1 instance = new LeetCode_3_455_1();
        System.out.println(instance.findContentChildren(g, s));
    }
}