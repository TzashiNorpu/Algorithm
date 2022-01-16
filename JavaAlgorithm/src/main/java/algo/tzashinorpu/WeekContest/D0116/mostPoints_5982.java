package algo.tzashinorpu.WeekContest.D0116;

import java.util.HashSet;

public class mostPoints_5982 {
    long[] memo;

    public long mostPointsDfs(int[][] questions) {
        this.memo = new long[questions.length];
        return dfs(0, questions);
    }

    private long dfs(int index, int[][] questions) {
        if (index >= questions.length) {
            return 0;
        }
        if (memo[index] != 0) {
            return memo[index];
        }
        // 从后往前拿
        long not_take_it = dfs(index + 1, questions);
        long take_it = questions[index][0] + dfs(index + questions[index][1] + 1, questions);
        this.memo[index] = Math.max(take_it, not_take_it);
        return memo[index];
    }

    // {92, 1}, {5, 5}, {65, 3}
    public long mostPointsReverseDp(int[][] questions) {
        int length = questions.length;
        long[] dp = new long[length + 1];
        for (int i = length - 1; i >= 0; i--) {
            var q = questions[i];
            var j = i + q[1] + 1;
            dp[i] = Math.max(dp[i + 1], q[0] + (j < length ? dp[j] : 0));
        }
        return dp[0];
    }

    // {92, 1}, {5, 5}, {65, 3}
    public long mostPointsOrderedDp(int[][] questions) {
        int length = questions.length;
        long[] dp = new long[length + 1];
        for (int i = 0; i < length; i++) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
            var q = questions[i];
            var j = Math.min(i + q[1] + 1, length);
            dp[j] = Math.max(dp[j], dp[i] + q[0]);
        }
        return dp[length];
    }
}
