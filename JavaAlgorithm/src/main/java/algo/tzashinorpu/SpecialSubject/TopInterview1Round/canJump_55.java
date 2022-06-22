package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

public class canJump_55 {
    public boolean canJump(int[] nums) {
        int reach = nums[0];
        for (int i = 0; i <= reach; i++) {
            if (reach >= nums.length - 1) return true;
            reach = Math.max(reach, i + nums[i]);
        }
        return false;
    }
}
