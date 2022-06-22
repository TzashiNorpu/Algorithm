package algo.tzashinorpu.SpecialSubject.TopInterview1Round;

public class firstMissingPositive_41 {
    public int firstMissingPositive(int[] nums) {
        //[3,4,-1,1]
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0) nums[i] = len + 1;
        }
        //[3,4,5,1]
        for (int i = 0; i < len; i++) {
            // 会覆盖  所以要用 abs
            int num = Math.abs(nums[i]);
            // 原值只做取反 -> 不会改变计算出来的索引位置
            if (num <= len) nums[num - 1] = -Math.abs(nums[num - 1]);
            //[3,4,5,1] -> [3,4,-5,1]
            //[3,4,-5,1] -> [3,4,-5,-1]
            //[3,4,-5,-1] -> [-3,4,-5,-1]
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) return i + 1;
        }
        return len + 1;
    }
}
