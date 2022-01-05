package algo.tzashinorpu.SecondRound.Chapter12;

public class numDecodings_091 {
    public int numDecodings(String s) {
        /*
        11106:
        "AAJF" ，将消息分组为 (1 1 10 6)
        "KJF" ，将消息分组为 (11 10 6)*/
        // dp[i]:str[0..i]的译码总数
        // s[i]==0 -> i-1=1 || i-1==2 -> dp[i]=dp[i-1]  i和i-1合并译码
        // s[i-1]==1 -> dp[i]=dp[i-1]+dp[i-2] -> dp[i-1]:s[i]和s[i-1]分开译码 dp[i-2]:s[i]和s[i-1]合并译码
        // s[i-1]==2 -> '1'<s[i]<'6' -> dp[i]=dp[i-1]+dp[i-2]
        /*
          0  0   -> 0
          1-20   -> 合并译码
          3-90   -> 0
          0  1-6 -> 分开译码
          1  1-6 -> 分开+合并译码
          2  1-6 -> 分开+合并译码
          3-91-6 -> 分开译码
          0  7-9 -> 分开译码
          1  7-9 -> 分开+合并译码
          2  7-9 -> 分开译码
          3-97-9 -> 分开译码
         */
        int length = s.length();
        int[] dp = new int[length];
        if (s.charAt(0) != '0') {
            dp[0] = 1;
        } else {
            return 0;
        }
        for (int i = 1; i < length; i++) {
            // 合并译码
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    dp[i] = i - 2 < 0 ? dp[i - 1] : dp[i - 2];
                } else {
                    return 0;
                }
            } else {
                //分开+合并译码
                if ((s.charAt(i - 1) == '1') || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6' && s.charAt(i) >= '1')) {
                    dp[i] = dp[i - 1] + (i - 2 >= 0 ? dp[i - 2] : 1);
                } else {
                    // 分开译码
                    dp[i] = dp[i - 1];
                }
            }
        }
        return dp[length - 1];
    }
}
