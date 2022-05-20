package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class searchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length, l = 0, r = n - 1;
        int[] ans = new int[2];
        // 找首位
        while (l <= r) {
            int c = l + (r - l) / 2;
            if (nums[c] < target) l = c + 1;
            else r = c - 1;
        }
        ans[0] = (l < n && nums[l] == target) ? l : -1;
        l = 0;
        r = n;
        while (l < r) {
            int c = l + (r - l) / 2;
            if (nums[c] <= target) l = c + 1;
            else r = c;
        }
        ans[1] = (l > 0 && nums[l - 1] == target) ? l - 1 : -1;
        return ans;
    }
}
