package algo.tzashinorpu.FirstRound.Chapter11;

public class LeetCode_3_033_1 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            // [4,5,6,7,8,1,2]  1
            // [10,11,4,5,6,7,8]  11
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if ((nums[l] < nums[mid] && target >= nums[l] && target <= nums[mid])
                    || (nums[mid] < nums[r] && target < nums[mid] && nums[mid] > nums[r])) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
