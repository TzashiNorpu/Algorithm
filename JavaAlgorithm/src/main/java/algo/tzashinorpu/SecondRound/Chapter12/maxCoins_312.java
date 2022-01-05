package algo.tzashinorpu.SecondRound.Chapter12;

public class maxCoins_312 {
    public int maxCoins(int[] nums) {
       /* nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
        coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167*/
        int length = nums.length;
        int[] arr = new int[length + 2];
        arr[0] = 1;
        arr[length + 1] = 1;
        int newLen = arr.length;
        int[][] dp = new int[newLen][newLen];
        // 1,3,1,5,8,1
        // dp[i][j] = dp[i][k] + dp[k][j] + arr[i]*arr[k]*arr[j]
        System.arraycopy(nums, 0, arr, 1, length);
        for (int len = 3; len <= newLen; len++) {
            for (int i = 0; i <= newLen - len; i++) {
                int j = (i + len - 1);
                for (int k = i + 1; k < j; k++) {
                    // dp[0][2]= 3 dp[1][3]=15
                    // dp[0][3]= dp[0][1] + dp[1][3] | dp[0][2] + dp[2][3]
                    // dp[0][2]=
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + arr[i] * arr[k] * arr[j]);
                }
            }
        }
        return dp[0][length + 1];
    }
}
