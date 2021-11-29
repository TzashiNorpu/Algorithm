package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_091_1 {
    public int numDecodings(String s) {
        int length = s.length();
        int[] dp = new int[length];
        char t = s.charAt(0);
        if (t == '0') {
            return 0;
        }
        dp[0] = 1;
        /*
          0  0
          1-20
          3-90
          0  1-6
          1-21-6
          3-91-6
          0  1-9
          1  1-9
          2  1-9
          3-91-9
         */
        for (int i = 1; i < length; i++) {
            char curr = s.charAt(i);
            char pre = s.charAt(i - 1);
            if (curr == '0') {
                if (pre == '1' || pre == '2') {
                    dp[i] = ((i - 2) < 0 ? dp[i - 1] : dp[i - 2]);
                } else {
                    return 0;
                }
            } else {
                if (curr >= '1' && curr <= '6') {
                    /*if (pre == '0') {
                        dp[i] = dp[i - 1];
                    } else if (pre == '1' || pre == '2') {
                        dp[i] = dp[i - 1] + ((i - 2) < 0 ? dp[i - 1] : dp[i - 2]);
                    } else {
                        dp[i] = dp[i - 1];
                    }*/
                    if (pre == '1' || pre == '2') {
                        dp[i] = dp[i - 1] + ((i - 2) < 0 ? dp[i - 1] : dp[i - 2]);
                    } else {
                        dp[i] = dp[i - 1];
                    }
                } else {
                    /*if (pre == '0') {
                        dp[i] = dp[i - 1];
                    } else if (pre == '1') {
                        dp[i] = dp[i - 1] + ((i - 2) < 0 ? dp[i - 1] : dp[i - 2]);
                    } *//*else if (pre == '2') {
                        dp[i] = dp[i - 1];
                    } else {
                        return 0;
                    }*//* else {
                        dp[i] = dp[i - 1];
                    }*/
                    if (pre == '1') {
                        dp[i] = dp[i - 1] + ((i - 2) < 0 ? dp[i - 1] : dp[i - 2]);
                    } else {
                        dp[i] = dp[i - 1];
                    }
                }
            }
        }
        return dp[length - 1];
    }
}
