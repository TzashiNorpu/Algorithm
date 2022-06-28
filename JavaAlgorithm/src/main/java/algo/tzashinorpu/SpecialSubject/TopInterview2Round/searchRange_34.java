package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class searchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int[] res = {-1, -1};
        if (r == -1) return res;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        // 没找到
        if (l == nums.length || nums[l] != target) return res;
        res[0] = l;
        r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        res[1] = r;
        return res;
    }
}
