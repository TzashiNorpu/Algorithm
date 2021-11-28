package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_032_1 {
    public int longestValidParentheses(String s) {
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
}
