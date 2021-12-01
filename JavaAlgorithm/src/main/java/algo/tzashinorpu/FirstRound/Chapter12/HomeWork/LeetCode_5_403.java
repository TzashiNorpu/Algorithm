package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_403 {
    public boolean canCross(int[] stones) {
        // 数组存放石头位置
        // 上一步跳跃了 k 个单位，那么它接下来的跳跃距离只能选择为 k - 1、k 或 k + 1 个单位
        return helper(stones, 0, 0);
    }

    private boolean helper(int[] stones, int index, int k) {
        
        return false;
    }
}
