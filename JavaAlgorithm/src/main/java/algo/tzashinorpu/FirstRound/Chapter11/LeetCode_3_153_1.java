package algo.tzashinorpu.FirstRound.Chapter11;

public class LeetCode_3_153_1 {
    public int findMin(int[] nums) {
        // 3,4,5,6,2    2
        int l = 0;
        int r = nums.length - 1;
        if (nums[l] <= nums[r]) {
            return nums[l];
        }
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[l] < nums[mid]) {
                l = mid + 1;
            }
            if (nums[mid] < nums[r]) {
                r = mid - 1;
            }
        }
        return -1;
    }
}
