package algo.tzashinorpu.DpPlan.I;

public class maxScoreSightseeingPair_1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int length = values.length;
        int[] dp = new int[length];
        // 8,1,5,2,6 -> 11  value(x)+x + value(j)-j 寻找 j 之前最大的 value(x)+x
        int temp = values[0];
        dp[0] = values[0];
        int max = 0;
        for (int i = 1; i < length; i++) {
            dp[i] = temp + values[i] - i;
            temp = Math.max(i + values[i], temp);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
