package algo.tzashinorpu.WeekContest.D0123;

import java.util.Arrays;

public class countElements_5989 {
    public int countElements(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        // -3,-3,-3,-3
        // -3,-3,-3,-3,-3
        // -3,-3,1,3,3
        // -3,-3,3,8
        while (l <= r && (nums[l] == nums[l + 1] || nums[r] == nums[r - 1])) {
            if (nums[l] == nums[l + 1]) {
                l++;
            }
            if (nums[r] == nums[r - 1]) {
                r--;
            }
        }
        return r <= l ? 0 : r - l - 1;
    }
}
