package algo.tzashinorpu.DpPlan.GSSY.DoublePoint;

public class jump_45 {
    public int jump(int[] nums) {
        int step = 0;
        int rMost = 0;
        int prevMost = 0;
        // 最初位于数组 0 的位置
        for (int i = 0; i < nums.length - 1; i++) {
            rMost = Math.max(rMost, i + nums[i]);
            if (prevMost == i) {
                prevMost = rMost;
                step++;
            }
        }
        return step;
    }
}
