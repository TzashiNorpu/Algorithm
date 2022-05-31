package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Stack;

public class isValid_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.empty() && stack.peek() == pairOf(c)) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.empty();
    }

    private Character pairOf(char c) {
        if (c == ')') return '(';
        if (c == ']') return '[';
        return '{';
    }
}
