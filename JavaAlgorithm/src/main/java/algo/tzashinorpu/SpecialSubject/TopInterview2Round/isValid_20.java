package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.Stack;

public class isValid_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                    s.charAt(i) == '[' ||
                    s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.empty() && pair(s.charAt(i), stack.peek())) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.empty();
    }

    private boolean pair(char c1, char c2) {
        return (c1 == ')' && c2 == '(') || (c1 == '}' && c2 == '{') || (c1 == ']' && c2 == '[');
    }
}
