package algo.tzashinorpu.SecondRound.Chapter12;

public class rob_213 {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        int[] nums1 = new int[length - 1];
        int[] nums2 = new int[length - 1];
        System.arraycopy(nums, 0, nums1, 0, length - 1);
        System.arraycopy(nums, 1, nums2, 0, length - 1);
        return Math.max(robBottomUp(nums1), robBottomUp(nums2));
    }

    private int robBottomUp(int[] nums) {
        int prev = 0, curr = 0, temp = 0;
        for (int num : nums) {
            temp = curr;
            curr = Math.max(prev + num, curr);
            prev = temp;
        }
        return curr;
    }
}
