package algo.tzashinorpu.SecondRound.Chapter10;

public class jump_045 {
    public int jump(int[] nums) {
        int rightMost = 0;
        int preRightMost = rightMost;
        int step = 0;
        int length = nums.length;
        // 题目中假设了可达
        //[2,1]
        // 直到 n-1 可以处理 两个元素的数据  能到倒数第二个则可以到倒数第一个
        for (int i = 0; i < length - 1; i++) {
            rightMost = Math.max(rightMost, i + nums[i]);
            if (i == preRightMost) {
                preRightMost = rightMost;
                step++;
            }
        }
        return step;
    }
}
