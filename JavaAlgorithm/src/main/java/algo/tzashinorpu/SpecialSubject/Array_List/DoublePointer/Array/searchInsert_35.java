package algo.tzashinorpu.SpecialSubject.Array_List.DoublePointer.Array;

public class searchInsert_35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            // r 右侧 > target
            if (nums[mid] > target) r = mid - 1;
                // l 左侧 < target
            else if (nums[mid] < target) l = mid + 1;
            else return mid;
        }
        return l;
    }
}
