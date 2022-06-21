package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Stack;

public class scoreOfParentheses_856 {
    public int scoreOfParentheses(String s) {
        // "(()()((())))" -> 12
        /*Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(cur);
                cur = 0;
            } else {
                cur = stack.pop() + Math.max(cur * 2, 1);
            }
        }
        return cur;*/

        /*int res[] = new int[30], i = 0;
        for (char c : s.toCharArray())
            if (c == '(') res[++i] = 0;
            else res[i - 1] += Math.max(res[i--] * 2, 1);
        return res[0];*/
        // "(()()((())))" -> 12
        int res = 0, l = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') l++;
            else l--;
            // l>0 则说明要翻倍
            if (s.charAt(i) == ')' && s.charAt(i - 1) == '(') res += 1 << l;
        }
        return res;
    }
}
