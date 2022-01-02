package algo.tzashinorpu.Daily.COM;

public class LeetCode_312 {
    private int res = 0;

    // 超时
    public int maxCoinsBackTrack(int[] nums) {
        // 3 1 5 8
        int length = nums.length;
        int[] ints = new int[length + 2];
        System.arraycopy(nums, 0, ints, 1, length);
        boolean[] visited = new boolean[length + 2];
        ints[0] = 1;
        ints[length + 1] = 1;
        for (int i = 1; i < length + 1; i++) {
            backTack(ints, visited, 0, i, 0);
        }
        return this.res;
    }

    private void backTack(int[] ints, boolean[] visited, int temp, int pickIndex, int level) {
        if (level == ints.length - 2) {
            this.res = Math.max(res, temp);
            return;
        }
        if (pickIndex == ints.length - 1) {
            return;
        }

        int lIndex = pickIndex - 1;
        int rIndex = pickIndex + 1;
        while (visited[lIndex]) {
            lIndex--;
        }
        while (visited[rIndex]) {
            rIndex++;
        }
        int mul = ints[pickIndex] * ints[lIndex] * ints[rIndex];
        visited[pickIndex] = true;
        for (int i = 1; i < ints.length; i++) {
            if (!visited[i]) {
                backTack(ints, visited, temp + mul, i, level + 1);
            }
        }
        visited[pickIndex] = false;
    }


    public int maxCoinsDp(int[] nums) {
        // dp[i][j] = dp[i][k] + dp[k][j] + nums[i]*nums[k]*nums[j]
        // 1 2 3 4 1
        // j = 2  i = 0  k=1 dp[0][2]=6
        // j=3 i=0  k=1 dp[0][3] = dp[0][1] + dp[1][3] +8 此时dp[1][3]还没计算
        // j=3 i=0  k=2
        int length = nums.length;
        int[] ints = new int[length + 2];
        int[][] dp = new int[length + 2][length + 2];
        System.arraycopy(nums, 0, ints, 1, length);
        // j = 2  i = 0  k=1 dp[0][2]=6
        // j=3 i=0  k=1 dp[0][3] = dp[0][1] + dp[1][3] +8 此时dp[1][3]还没计算
        // 需要换个思路  按长度来进行递归
        // j=3 i=0  k=2
        /*for (int j = 2; j < length + 2; j++) {
            for (int i = 0; i < j - 1; i++) {
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][k] + dp[k][j] + ints[i] * ints[k] * ints[j], dp[i][j]);
                }
            }
        }*/
        // 长区间基于短的区间进行dp
        ints[0] = 1;
        ints[length + 1] = 1;
        for (int len = 3; len <= length + 2; len++) {
            for (int i = 0; i <= length + 2 - len; i++) {
                // k 是 pick 的位置，比 j 小1
                int j = i + len - 1;
                // 1,0,1,2,3,4,1  length=7  len=2 iMax = 7-3
                // dp[0][2]  dp[1][3]  dp[2][4] dp[3][5] dp[4][6]
                // dp[0][3]  dp[1][4]  dp[2][5] ...
                // dp[0][4]  dp[1][5]  dp[2][6] ...
                for (int k = i + 1; k < j; k++) {
                    // dp[0][3] = dp[0][1] + dp[1][3] + x
                    // dp[0][3] = dp[0][2] + dp[2][3] + x
                    int temp = dp[i][k] + dp[k][j] + ints[i] * ints[k] * ints[j];
                    dp[i][j] = Math.max(temp, dp[i][j]);
                }
            }
        }
        return dp[0][length + 1];
    }
}
