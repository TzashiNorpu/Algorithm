package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

import java.util.LinkedList;

public class LeetCode_5_032_1 {
    public int longestValidParentheses1(String s) {
        int length = s.length();
        int max = 0;
        int[] dp = new int[length];
        // ")()()((())  )  )"
        //  0020400024 10  0
        for (int i = 1; i < length; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    if (i - 2 >= 0) {
                        dp[i] = dp[i - 2] + 2;
                    } else {
                        dp[i] = 2;
                    }
                } else {
                    //s.charAt(i-1)==')
                    if (i - dp[i - 1] - 1 >= 0) {
                        if (s.charAt(i - dp[i - 1] - 1) == '(') {
                            dp[i] = dp[i - 1] + (i - dp[i - 1] - 2 < 0 ? 0 : dp[i - dp[i - 1] - 2]) + 2;
                        }
                    }
                }
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }

    public int longestValidParentheses2(String s) {
        // ")()()((())"
        //  0020400024 10  0
        // 最后一个没有被匹配的右括号的下标
        char[] chars = s.toCharArray();
        int max = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        int temp = 0;
        stack.offer(-1);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ')') {
                Integer pop = stack.pollLast();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    max = Math.max(max, i - stack.peek());
                }
            } else {
                stack.offer(i);
            }
        }
        return max;
    }
}
