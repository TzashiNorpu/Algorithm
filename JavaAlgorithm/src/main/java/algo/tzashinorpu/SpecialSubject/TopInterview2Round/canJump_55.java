package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class canJump_55 {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (max >= n - 1) return true;
            max = Math.max(max, i + nums[i]);
            if (max <= i) return false;
        }
        return false;
    }
}
