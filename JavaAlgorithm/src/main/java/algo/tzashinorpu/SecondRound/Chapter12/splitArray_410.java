package algo.tzashinorpu.SecondRound.Chapter12;

public class splitArray_410 {
    public int splitArray(int[] nums, int m) {
        /*令 f[i][j] 表示将数组的前 i 个数分割为 j 段所能得到的最大连续子数组和的最小值。
        在进行状态转移时，我们可以考虑第 j 段的具体范围，即我们可以枚举 k，其中前 k 个数被分割为 j−1 段，而第 k+1 到第 i 个数为第 j 段。此时，
        这 j 段子数组中和的最大值，就等于 f[k][j−1] 与 sum(k+1,i) 中的较大值，其中 sum(i,j) 表示数组 nums 中下标落在区间 [i,j] 内的数的和*/
        // nums = [7,2,5,10,8], m = 2 -> 18
        int[][] dp = new int[nums.length][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < Math.min(i, m); j++) {
                for (int k = 0; k < i; k++) {
                    
                }
            }
        }
    }
}
