package algo.tzashinorpu.Week05.Chapter12.HomeWork;

import java.util.Arrays;

public class LeetCode_5_032 {
    // https://leetcode-cn.com/problems/longest-valid-parentheses/
    // 最长有效括号
    private int longestValidParentheses(String s) {
        if (s.length() <= 1) return 0;
        int curMax = 0;
        int[] longest = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    // (longest[i - 2]
                    longest[i] = (i - 2) >= 0 ? (longest[i - 2] + 2) : 2;
                    curMax = Math.max(longest[i], curMax);
                } else {
                    // if s[i-1] == ')', combine the previous length.
                    // i - longest[i - 1] - 1
                    if (i - longest[i - 1] - 1 >= 0 && s.charAt(i - longest[i - 1] - 1) == '(') {
                        // 拼接当前串长度(longest[i - 1] + 2) + 前一串的长度(longest[i - longest[i - 1] - 2])
                        longest[i] = longest[i - 1] + 2 + ((i - longest[i - 1] - 2 >= 0) ? longest[i - longest[i - 1] - 2] : 0);
                        curMax = Math.max(longest[i], curMax);
                    }
                }
            }
            //else if s[i] == '(', skip it, because longest[i] must be 0
            // ( )  (  )  (  )  (  (  (   )  (   ) (  )  (   (  (   )   )      )                         )  )
            // 0 2  0  4  0  6  0  0  0  2   0  4  0 6   0   0  0  2   4   ( 4+2 + 6:longest[19- 4 -2 ]=10)
            //                                                             index:19
        }

        Arrays.stream(longest).forEach(System.out::println);
        return curMax;
    }

    public static void main(String[] args) {
        final String s = "()()()((()()()((()))))";
        final LeetCode_5_032 test = new LeetCode_5_032();
        System.out.println(test.longestValidParentheses(s));
    }

}
