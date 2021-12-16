package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

class LeetCode_5_076Test {

    @Test
    void minWindow() {
        LeetCode_5_076 ins = new LeetCode_5_076();
        String s = "bbaa";
        String t = "aba";
        System.out.println(ins.minWindow(s, t));
    }
}