package algo.tzashinorpu.WeekContest.D221009;

import java.util.*;

public class robotWithString_6202 {
    public String robotWithString(String s) {
        /*
         * 求出栈序列的最小字典序。
         * 我们首先将题目描述进行转化：有一个初始为空的栈，给定字符的入栈顺序，求字典序最小的出栈序列。
         * 当一个字符入栈后，我们持续检查栈顶元素 c。设还未入栈的字符中，字典序最小的字符是 m，有以下两种情况。
         * c ≤m：此时弹出 c 最优。如果此时按兵不动，下一个出栈的将会是大等于 c 的字符，答案不会变优。
         * c >m：此时不弹出 c，等待后续更小的字符入栈。
         * 所有字符都入栈后，栈内的剩余字符按顺序弹出即可。
         */
        StringBuilder res = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        int n = s.length();
        int[] f = new int[n + 1];
        f[n] = 'z' + 1;
        for (int i = n - 1; i >= 0; i--) {
            f[i] = Math.min(f[i + 1], s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            stk.push(s.charAt(i));
            while (!stk.empty() && stk.peek() <= f[i + 1])
                res.append(stk.pop());
        }
        return res.toString();
    }
}
