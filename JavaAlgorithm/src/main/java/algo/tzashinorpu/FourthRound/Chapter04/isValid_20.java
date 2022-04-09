package algo.tzashinorpu.FourthRound.Chapter04;

import java.util.Stack;

public class isValid_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')') {
                if (stack.size() == 0 || stack.peek() != '(')
                    return false;
            }
            if (c == ']') {
                if (stack.size() == 0 || stack.peek() != '[')
                    return false;
            }
            if (c == '}') {
                if (stack.size() == 0 || stack.peek() != '{')
                    return false;
            }
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        return stack.size() == 0;
    }
}
