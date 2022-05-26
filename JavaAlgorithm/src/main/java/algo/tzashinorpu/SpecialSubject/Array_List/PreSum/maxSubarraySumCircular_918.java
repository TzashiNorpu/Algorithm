package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

import java.util.Arrays;

public class maxSubarraySumCircular_918 {
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int[] temp = new int[2 * len];
        System.arraycopy(nums, 0, temp, 0, len);
        System.arraycopy(nums, 0, temp, len, len);
        int ans = 0;
        for (int i = 0, j = 0; j < 2 * len; ) {
            if (nums[j] > 0) {
                if (j - i + 1 <= len)
                    ans += nums[j++];
                else {
                    ans -= nums[i++];
                }
            } else {
                i++;
                j++;
            }

        }
        return ans;
    }
}
