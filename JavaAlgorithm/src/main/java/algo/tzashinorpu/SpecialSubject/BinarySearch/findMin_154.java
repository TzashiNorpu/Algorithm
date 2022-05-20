package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class findMin_154 {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums[r] > nums[l]) return nums[l];
        while (l <= r) {
            if (nums[l] < nums[r]) return nums[l];
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[l]) l = mid + 1;
            else if (nums[mid] < nums[r]) r = mid;
            else l++;
        }
        // 2, 2, 2, 0, 1 -> 2, 2, 0, 1 -> 0, 1
        return nums[r];
    }
}
