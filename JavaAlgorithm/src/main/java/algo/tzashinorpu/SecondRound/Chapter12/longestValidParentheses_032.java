package algo.tzashinorpu.SecondRound.Chapter12;

import java.util.ArrayList;
import java.util.LinkedList;

public class longestValidParentheses_032 {
    public int longestValidParenthesesWithStack(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.offer(-1);
        // ")()()((())"
        // stack更新最后一个没有被匹配的右括号的下标
        int max = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                stack.pollLast();
                if (stack.isEmpty()) {
                    stack.offerLast(i);
                } else {
                    max = Math.max(max, i - stack.peekLast());
                }
            } else {
                stack.offerLast(i);
            }
        }
        return max;
    }

    public int longestValidParenthesesWithDp(String s) {
        // ") ( ) (      )          ( ( ( )              )                                            )"
        //  0 0 2 0  dp[i-2]+2=4    0 0 0 2   i-dp[i-1]-2->匹配当前)的(的上一个位置->拿到之前的有效括号长度
        char[] chars = s.toCharArray();
        int[] dp = new int[chars.length];
        int max = 0;
        for (int i = 1; i < chars.length; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i - 2 <= 0 ? 0 : dp[i - 2]) + 2;
                }
                if (i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = (i - dp[i - 1] - 2 <= 0 ? 0 : dp[i - dp[i - 1] - 2]) + dp[i - 1] + 2;
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
