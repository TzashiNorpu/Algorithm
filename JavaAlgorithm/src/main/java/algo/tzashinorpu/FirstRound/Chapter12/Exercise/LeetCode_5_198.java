package algo.tzashinorpu.FirstRound.Chapter12.Exercise;

public class LeetCode_5_198 {
    // 超时
    public int robRecursie(int[] nums) {
        return Math.max(recursive(0, nums), recursive(1, nums));
    }

    private int recursive(int index, int[] nums) {
        if (index >= nums.length) {
//            System.out.println(index);
            return 0;
        }
        return nums[index] + Math.max(recursive(index + 2, nums), recursive(index + 3, nums));
    }

    public int robBottomUp(int[] nums) {
       /*
       int max = 0;
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        sums[1] = nums[1];
        sums[2] = nums[0] + nums[2];
        max = Math.max(Math.max(sums[0], sums[1]), sums[2]);
        for (int i = 3; i < nums.length; i++) {
            sums[i] = Math.max(sums[i - 2] + nums[i], sums[i - 3] + nums[i]);
            max = Math.max(max, sums[i]);
        }
        return max;*/
        // refactor
        // 2, 1, 1, 1, 2
        /*int max = nums[0];
        int length = nums.length;
        if (length == 1) {
            return max;
        }
        int gap2 = nums[1];
        int gap3 = nums[0];
        max = Math.max(gap2, gap3);
        if (length == 2) {
            return max;
        }
        int gap1 = nums[2] + nums[0];
        max = Math.max(gap1, max);
        for (int i = 3; i < length; i++) {
            int gap = Math.max(Math.max(gap2 + nums[i], gap3 + nums[i]), max);
            gap3 = gap2;
            gap2 = gap1;
            gap1 = gap;
            max = Math.max(gap, max);
        }
        return max;*/
        // prev(2) curr(2)
        //    2,     1,       1,   2
        //         prev(2)  curr(3)
        int pre = 0, cur = 0, temp;
        for (int t : nums) {
            temp = cur;
            cur = Math.max(cur, pre + t);
            pre = temp;
        }
        return cur;
    }
}
