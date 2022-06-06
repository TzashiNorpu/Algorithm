package algo.tzashinorpu.SpecialSubject.Stack_Queue;

import java.util.Stack;

public class longestValidParentheses_32 {
    public int longestValidParentheses(String s) {
        // ))(())())
        int res = 0;
        int[] dp = new int[s.length()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
                dp[i] = 0;
            } else {
                if (!stack.empty()) {
                    Integer lIndex = stack.pop();
                    int len = i - lIndex + 1;
                    dp[i] = len + (i - len < 0 ? 0 : dp[i - len]);
                    res = Math.max(res, dp[i]);
                } else {
                    dp[i] = 0;
                }
            }
        }
        return res;
    }
}
