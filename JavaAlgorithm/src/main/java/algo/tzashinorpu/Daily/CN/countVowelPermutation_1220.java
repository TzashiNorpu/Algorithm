package algo.tzashinorpu.Daily.CN;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class countVowelPermutation_1220 {
    public int countVowelPermutation(int n) {
        // dp[i][j] be the number of strings of length i that ends with the j - th vowel
        // Deduce the recurrence from the given relations between vowels.
        long[][] dp = new long[n][5];
        // a e i o u
        /*
        元音字母 a 前面只能跟着 e, i, u
        元音字母 e 前面只能跟着 a, i
        每个元音 i 前面只能跟着 e, o
        每个元音 o 前面只能跟着 i
        每个元音 u 后面只能跟着 o, i
        ->
        dp[i][0]=dp[i-1][1]+dp[i-1][2]+dp[i-1][4]
        dp[i][1]=dp[i-1][0]+dp[i-1][2]
        dp[i][2]=dp[i-1][1]+dp[i-1][3]
        dp[i][3]=dp[i-1][2]
        dp[i][4]=dp[i-1][2]+dp[i-1][3]
        */
        int mod = 1000000007;
        Arrays.fill(dp[0], 1);
        for (int i = 1; i < n; i++) {
            dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % mod;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod;
            dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % mod;
            dp[i][3] = (dp[i - 1][2]) % mod;
            dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % mod;
        }
        long res = 0;
        for (int i = 0; i < 5; i++) {
            res = res % mod + dp[n - 1][i] % mod;
        }
        return (int) (res % mod);
        //        return (int) Arrays.stream(dp[n - 1]).map(x -> x % mod).sum() % mod;
    }
}
