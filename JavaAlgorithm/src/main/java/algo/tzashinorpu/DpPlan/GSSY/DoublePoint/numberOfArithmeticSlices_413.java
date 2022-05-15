package algo.tzashinorpu.DpPlan.GSSY.DoublePoint;

public class numberOfArithmeticSlices_413 {
    public int numberOfArithmeticSlices(int[] nums) {
        // 对于任意长度N的相同差值序列，总有子序列个数X={1,N-1}的累加和
        // {1,2,3,4} -> {1,2,3} {2,3,4} {1,2,3,4}
        // {1,2,3,4,5} -> {1,2,3,4,5}  {1,2,3,4} {2,3,4,5} {1,2,3} {2,3,4} {3,4,5}
        int ans = 0;
        for (int i = 0; i < nums.length - 2; ) {
            int j = i;
            int d = nums[j + 1] - nums[j];
            // 循环退出时 max(j) = len - 1
            while (j + 1 < nums.length && nums[j + 1] - nums[j] == d) j++;
            int len = j - i + 1;
            int a1 = 1, an = len - 3 + 1;
            ans += (a1 + an) * an / 2;
            i = j;
        }
        return ans;
    }
}
