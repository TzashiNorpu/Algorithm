package algo.tzashinorpu.FirstRound.Chapter09;


import org.junit.jupiter.api.Test;

import java.util.List;

class LeetCode_3_017Test {

    @Test
    void letterCombinations() {
        LeetCode_3_017 instance = new LeetCode_3_017();
        String s = "23";
        List<String> res = instance.letterCombinations(s);
        System.out.println(res);
    }
}