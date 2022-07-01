package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

import java.util.HashMap;

public class numDecodings_91 {

    /*
    s[i] 本身可能表示一个字母，这种情况下解码数量为 numDecodings(s[0..i-1])
    s[i] 可能和 s[i - 1] 结合起来表示一个字母，这种情况下解码数量为 numDecodings(s[0..i-2])
    */
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        // dp[0] means an empty string will have one way to decode, dp[1] means the way to decode a string of size 1.
        // base case: s 为空或者 s 只有一个字符的情况
        dp[0] = 1; // 为了 "10" 情况时  dp[i] += dp[i-2]
        // dp[1] 第 0 个字符
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            char c = s.charAt(i - 1), d = s.charAt(i - 2);
            if (/*'1' <= c && c <= '9'*/c != '0') {
                // 1. s[i] 本身可以作为一个字母
                dp[i] += dp[i - 1];
            }
            if (d == '1' || (d == '2' && c <= '6')) {
                // 2. s[i] 和 s[i - 1] 结合起来表示一个字母
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
