package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import org.junit.jupiter.api.Test;

class LeetCode_5_032_1Test {

    @Test
    void longestValidParentheses() {
        LeetCode_5_032_1 ins = new LeetCode_5_032_1();
        System.out.println(ins.longestValidParentheses("()()"));
        System.out.println(ins.longestValidParentheses(")()()((())))"));
        System.out.println(ins.longestValidParentheses("())"));
        System.out.println(ins.longestValidParentheses("(()())"));
    }
}