package algo.tzashinorpu.SecondRound.Chapter08;

import java.util.Arrays;

public class majorityElement_169 {
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        int res = nums[0];
        int resCnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == res) {
                resCnt++;
            } else {
                resCnt--;
                if (resCnt == 0) {
                    res = nums[i];
                    resCnt = 1;
                }
            }
        }
        return res;
    }
}
