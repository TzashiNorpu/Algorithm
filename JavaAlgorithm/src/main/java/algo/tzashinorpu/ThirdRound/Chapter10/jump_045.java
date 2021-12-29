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
            // step-1 步内更新 step(下一步) 步的最远可达的距离范围(距离范围即i)
            // 遍历数组时，我们不访问最后一个元素，这是因为在访问最后一个元素之前，我们的边界一定大于等于最后一个位置，否则就无法跳到最后一个位置了。
            // 如果访问最后一个元素，在边界正好为最后一个位置的情况下，我们会增加一次「不必要的跳跃次数」，因此我们不能访问最后一个元素。
            if (i == preFurthest) {
                step++;
                preFurthest = furthest;
            }
        }
        return step;
    }
}