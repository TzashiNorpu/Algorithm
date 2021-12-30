package algo.tzashinorpu.SecondRound.Chapter11;

public class findMin_153 {
    public int findMin(int[] nums) {
        // 二分
        int l = 0, r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l + 1) / 2;
            // 左半部分有序
            if (nums[l] <= nums[mid]) {
                // 整个数组有序
                if (nums[l] <= nums[r]) {
                    return nums[l];
                } else {
                    // 突变位置在右侧
                    l = mid;
                }
            }
            if (nums[mid] <= nums[r]) {
                if (nums[mid - 1] > nums[mid]) {
                    return nums[mid];
                }
                if (nums[l] <= nums[r]) {
                    return nums[l];
                }
                r = mid;
            }
        }
        return ans;
    }
}
