package algo.tzashinorpu.FirstRound.test;

public class LT33 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int res = search(nums, target);
        System.out.println(res);
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 左半部分有序
            if (nums[l] <= nums[mid]) {
                // 左半部分的左边
                if (target <= nums[mid] && target >= nums[l]) {
                    // target 可能等于 mid，所以用 r 更新 mid
                    r = mid;
                } else {
                    // 这个分支 target 不可能等于 mid，所以用 r + 1 更新 l
                    l = mid + 1;
                }
            }
            // 右半部分有序
            else {
                // 右半部分的右边
                if (target >= nums[mid] && target <= nums[r]) {
                    // target 可能等于 mid，所以用 mid 更新 l
                    l = mid;
                } else {
                    // 这个分支 target 不可能等于 mid，所以用 mid - 1 更新 r
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 注意
        // 搜索区间
        while (left <= right) { // 注意
            int mid = (right + left) / 2;
            if (nums[mid] == target)
                return 1;
            else if (nums[mid] < target)
                left = mid + 1; // 注意
            else if (nums[mid] > target)
                right = mid - 1; // 注意
        }
        return -1;
    }
}
