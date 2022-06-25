package algo.tzashinorpu.GSSY.DoublePoint;

import java.util.Arrays;

public class threeSumClosest_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > target) r--;
                else if (sum < target) l++;
                else return target;
                if (Math.abs(sum - target) < Math.abs(ans - target)) ans = sum;
            }
        }
        return ans;
    }
}
