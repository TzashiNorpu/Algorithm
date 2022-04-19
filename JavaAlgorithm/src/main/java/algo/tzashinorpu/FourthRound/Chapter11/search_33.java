package algo.tzashinorpu.FourthRound.Chapter11;

public class search_33 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int mid;
        // = 处理只有一个数字的 nums
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 左边有序
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target <= nums[mid]) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            } else {
                // 右边有序
                if (target >= nums[mid] && target <= nums[r]) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
