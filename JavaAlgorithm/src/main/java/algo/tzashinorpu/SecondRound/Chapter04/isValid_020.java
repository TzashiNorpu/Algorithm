package algo.tzashinorpu.SecondRound.Chapter04;

import java.util.ArrayList;
import java.util.LinkedList;

public class isValid_020 {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            stack.offer(c);
            if ((c == ')' && stack.peek() != '(') || (c == ']' && stack.peek() != '[') || (c == '}' && stack.peek() != '{')) {
                return false;
            }
            if ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[') || (c == '}' && stack.peek() == '{')) {
                stack.pollLast();
                stack.pollLast();
            }
        }
        return stack.size() == 0;
    }
}
