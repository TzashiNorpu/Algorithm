package algo.tzashinorpu.SpecialSubject.Array_List.PreSum;

public class maxSubarraySumCircular_918 {
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int max = nums[0], curMax = nums[0], min = nums[0], curMin = nums[0], sum = nums[0];
        // 1,-2,3,-2
        for (int i = 1; i < len; i++) {
            sum += nums[i];
            curMax = Math.max(curMax + nums[i], nums[i]);
            max = Math.max(max, curMax);
            curMin = Math.min(curMin + nums[i], nums[i]);
            min = Math.min(min, curMin);
        }
        return max < 0 ? max : Math.max(max, sum - min);
    }
}
