package algo.tzashinorpu.GSSY.DoublePoint;


public class searchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int idx = -1;
        while (l <= r) {
            int mid = (l + r + 1) >> 1;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                idx = mid;
                break;
            }
        }
        if (idx == -1) {
            return new int[]{-1, -1};
        }
        int m = idx, n = idx;
        for (; m > 0; ) {
            if (nums[m - 1] == nums[idx]) m--;
            else break;
        }
        for (; n < nums.length - 1; ) {
            if (nums[n + 1] == nums[idx]) n++;
            else break;
        }
        return new int[]{m, n};
    }
}
