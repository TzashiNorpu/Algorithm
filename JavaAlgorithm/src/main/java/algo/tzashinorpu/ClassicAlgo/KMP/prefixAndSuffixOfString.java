package algo.tzashinorpu.ClassicAlgo.KMP;

public class prefixAndSuffixOfString {
    public int[] get(String s) {
        int n = s.length();
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1, j = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(j)) dp[i] = 0;
            else dp[i] = (j++);

        }
        return dp;
    }
}
