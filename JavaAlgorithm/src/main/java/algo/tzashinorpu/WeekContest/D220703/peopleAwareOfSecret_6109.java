package algo.tzashinorpu.WeekContest.D220703;

public class peopleAwareOfSecret_6109 {
    public int peopleAwareOfSecret(int n, int delay, int forget) {

        // dp[i]的含义是第i天获取秘密的人
        /*
        统计第i天新增的人数就好了，然后知道秘密的总人数其实就等于从最后一天往前推forget天的人数和。
        每一个第i天知道秘密的人，都对[i+delay,i+forget)这个区间有贡献
         */
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int MOD = 1000000007;
        for (int i = 1; i < n + 1; i++) {
            /*for (int j = i + delay; j < i + forget; j++) {
                if (j <= n) dp[j] += dp[i];
            }*/
            for (int j = i + delay; j < Math.min(i + forget, n + 1); j++) {
                dp[j] += dp[i];
            }
        }
        int sum = 0;
        for (int i = n + 1 - forget; i < n + 1; i++) {
            sum = (sum + dp[i]) % MOD;
        }

        return sum;
    }
}
