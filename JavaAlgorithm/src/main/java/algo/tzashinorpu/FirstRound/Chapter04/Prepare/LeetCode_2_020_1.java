package algo.tzashinorpu.FirstRound.Chapter04.Prepare;

import java.util.Stack;

public class LeetCode_2_020_1 {
    public boolean isValid(String s) {
        Stack<Character> l  = new Stack<>();
        char c;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            c = s.charAt(i);
            if (c == '(' || c=='['||c=='{') {
                l.push(c);
            }else {
                if (l.size() < 1) {
                    return false;
                }
                if ((c == ')' && '('== l.peek()) || (c == ']' && '[' == l.peek()) || (c == '}' && '{' == l.peek())) {
                    l.pop();
                } else {
                    return false;
                }
            }
        }
        return l.empty();
    }

    public static void main(String[] args) {
        String s = "]";
        LeetCode_2_020_1 sol = new LeetCode_2_020_1();
        System.out.println(sol.isValid(s));
    }
}
