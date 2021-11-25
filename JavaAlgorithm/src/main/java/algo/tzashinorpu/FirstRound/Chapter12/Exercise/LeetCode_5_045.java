package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_045 {
    public int jump(int[] nums) {
        // 假设你总是可以到达数组的最后一个位置
        int furthest = 0;
        int step = 0;
        int transfer = 0;
        // 2,3,1,1,4
        for (int i = 0; i < nums.length - 1; i++) {
            furthest = Math.max(furthest, i + nums[i]);
            if (i == transfer) {
                transfer = furthest;
                step++;
            }
        }
        return step;
    }
}
