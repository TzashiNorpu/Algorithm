package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import org.junit.jupiter.api.Test;

class longestValidParentheses_32Test {

    @Test
    void longestValidParentheses() {
        longestValidParentheses_32 ins = new longestValidParentheses_32();
        System.out.println(ins.longestValidParentheses("))(())())"));
        System.out.println(ins.longestValidParentheses("()"));
        System.out.println(ins.longestValidParentheses("(()()(())(("));
    }
}