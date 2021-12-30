package algo.tzashinorpu.SecondRound.Chapter11;

public class search_033 {
    public int search(int[] nums, int target) {
        // 4,5,6,7,0,1,2   0 -> 4
        // 5,6,0,1,2,3,4   0 -> 2
        // 5,6,0,1,2,3,4   7 -> -1
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 左半部分有序
            if (nums[l] <= nums[mid]) {
                if (target <= nums[mid] && target >= nums[l]) {
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
