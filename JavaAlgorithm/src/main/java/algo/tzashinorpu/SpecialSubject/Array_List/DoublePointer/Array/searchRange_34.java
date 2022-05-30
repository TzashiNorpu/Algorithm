package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class searchRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int[] res = {-1, -1};
        if (r == -1) return res;
        // left
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) l = mid + 1; // l 左侧 < target
            else r = mid - 1; // r 右侧 >=target
        }
        if (l == nums.length || nums[l] != target) return res;
        res[0] = l;
        // right
        r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) l = mid + 1;// l 左侧 <= target
            else r = mid - 1; // r 右侧 > target
        }
        res[1] = r;
        return res;
    }
}
