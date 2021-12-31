package algo.tzashinorpu.SecondRound.Chapter12;

public class jump_045 {
    public int jump(int[] nums) {
        int step = 0;
        int furthest = 0;
        int preFurthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            furthest = Math.max(i + nums[i], furthest);
            if (i == preFurthest) {
                preFurthest = furthest;
                step++;
            }
        }
        return step;
    }
}
