package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_5_647_1Test {

    @Test
    void countSubstringsDp() {
        LeetCode_5_647_1 ins = new LeetCode_5_647_1();
        String s = "fdsklf";
        System.out.println(ins.countSubstringsDp(s));
        System.out.println(ins.countSubstringsM(s));
    }
}