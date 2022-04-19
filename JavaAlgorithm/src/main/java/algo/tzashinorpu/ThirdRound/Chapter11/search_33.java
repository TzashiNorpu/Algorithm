package algo.tzashinorpu.ThirdRound.Chapter11;

public class search_33 {
    public int search(int[] nums, int target) {
        // nums = [3,1], target = 1
        int l = 0, r = nums.length - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) return mid;
            // 左半边有序 [一个数字认为有序]
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target <= nums[mid]) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            } else {
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
