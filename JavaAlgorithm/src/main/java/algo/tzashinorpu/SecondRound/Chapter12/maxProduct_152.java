package algo.tzashinorpu.SecondRound.Chapter12;

public class maxProduct_152 {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int iMin = nums[0];
        int iMax = nums[0];
        // 2,3,-2,-3,0,4
        for (int i = 1; i < nums.length; i++) {
            int temp = iMax;
            int num = nums[i];
            // 连乘到当前位置的最大值  2,3,-2在index=2时为-2
            iMax = Math.max(Math.max(temp * num, iMin * num), num);
            // 连乘到当前位置的最小值  2,3在index=1时为3，因为2是index=0时候的iMin
            iMin = Math.min(Math.min(temp * num, iMin * num), num);
            max = Math.max(max, iMax);
        }
        return max;
    }
}
