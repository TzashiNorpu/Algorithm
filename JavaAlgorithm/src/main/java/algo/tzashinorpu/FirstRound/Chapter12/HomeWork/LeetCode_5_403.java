package algo.tzashinorpu.FirstRound.Chapter12.HomeWork;

public class LeetCode_5_403 {
    private boolean can = false;

    public boolean canCross1(int[] stones) {
        /*输入：stones = [0,1,3,5,6,8,12,17]
        输出：true*/
        // 数组存放有石块的索引位置
        // 第一步只能跳跃一个单位
      /*  if (stones[1] != 1) {
            return false;
        }*/
        // 上一步跳跃了 k 个单位，那么它接下来的跳跃距离只能选择为 k - 1、k 或 k + 1 个单位
        // 第一步只能跳跃一个单位,第二步 0 1 2
        helper(stones, 0, 1, 1);
        return this.can;
    }

    private void helper(int[] stones, int preIndex, int currIndex, int preStep) {
        if (currIndex >= stones.length) {
            return;
        }
        if (stones[currIndex] != stones[preIndex] + preStep) {
            return;
        }
        if (stones.length - 1 == currIndex) {
            this.can = true;
            return;
        }

        for (int i = 1; i < stones.length - preIndex; i++) {
            helper(stones, currIndex, currIndex + i, preStep - 1);
            helper(stones, currIndex, currIndex + i, preStep);
            helper(stones, currIndex, currIndex + i, preStep + 1);
        }
    }

    public boolean canCross2(int[] stones) {
        return helper2(stones, 0, 0);
    }

    private boolean helper2(int[] stones, int index, int k) {
        for (int i = index + 1; i < stones.length; i++) {
            int gap = stones[i] - stones[index];
            if (gap >= k - 1 && gap <= k + 1) {
                if (helper2(stones, i, gap)) {
                    return true;
                }
            } else if (gap > k + 1) {
                break;
            }
        }
        return index == stones.length - 1;
    }
}
