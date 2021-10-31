package algo.tzashinorpu.SecondRound.Chapter04;

import java.util.LinkedList;

public class isValid_020 {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (stack.size() == 0) {
                stack.push(c);
            } else {
                if ((c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[') || (c == '}' && stack.peek() != '{')) {
                    return false;
                } else if ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.size() == 0;
    }
}
