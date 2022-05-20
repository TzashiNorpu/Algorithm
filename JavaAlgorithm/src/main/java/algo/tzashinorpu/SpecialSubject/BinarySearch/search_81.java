package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class search_81 {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return true;
            // 左边有序
            if (nums[l] < nums[mid]) {
                // 在左边
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else if (nums[r] > nums[mid]) {
                // nums[r] > nums[mid]
                // 在右边
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                // nums[l] == nums[mid] || nums[r] == nums[mid]
                if (nums[l] == nums[mid]) l++;
                if (nums[r] == nums[mid]) r--;
            }
        }
        return false;
    }
}
