package algo.tzashinorpu.ThirdRound.Chapter10;

public class jump_045 {
    public int jump(int[] nums) {
        // 2,3,1,1,4 -> 2
        int step = 0;
        int furthest = 0;
        int preFurthest = furthest;
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            furthest = Math.max(i + nums[i], furthest);
            // 3, 0, 2, 0, 0
            // 在没到上一步的上限前这一步可以到达更远的位置时 更新这个上限  并记住上一次的上限
            //
            if (i == preFurthest) {
                step++;
                preFurthest = furthest;
            }
        }
        return step;
    }
}