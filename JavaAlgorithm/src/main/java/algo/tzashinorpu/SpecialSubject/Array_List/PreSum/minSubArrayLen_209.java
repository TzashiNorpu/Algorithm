package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

public class minSubArrayLen_209 {
    public int minSubArrayLen(int target, int[] nums) {
        // target = 7, nums = [2,3,1,1,2,4,3]
        int len = nums.length, ans = len + 1;
        for (int i = 0, j = 0; j < len; j++) {
            target -= nums[j];
            while (target <= 0) {
                ans = Math.min(ans, j - i + 1);
                target += nums[i++];
            }
        }
        return ans % (len + 1);
    }
}
