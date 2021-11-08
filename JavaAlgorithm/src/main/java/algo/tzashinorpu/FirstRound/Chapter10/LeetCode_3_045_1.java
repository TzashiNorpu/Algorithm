package algo.tzashinorpu.FirstRound.Chapter10;

public class LeetCode_3_045_1 {
    public int jump(int[] nums) {
        int rightMost = 0;
        int end = 0;
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            rightMost = Math.max(rightMost, i + nums[i]);
            if (i == end) {
                end = rightMost;
                step++;
            }
        }
        return end >= nums.length - 1 ? step : -1;
    }
}
