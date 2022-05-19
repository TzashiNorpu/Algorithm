package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class findMin_153 {
    public int findMin_1(int[] nums) {
        // 3,4,5,1,2 -> 1,2
        // 3,4,1,2 -> 3,4,1
        // l 在转折点左侧   r在转折点右侧
        int l = 0, r = nums.length - 1;
        if (nums[l] <= nums[r]) return nums[0];
        while (l + 1 != r) {
            int mid = l + (r - l) / 2;
            if (nums[l] < nums[mid]) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return nums[r];
    }

    public int findMin_2(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums[l] <= nums[r]) return nums[0];
        for (int i = r; i >= 1; i--) {
            if (nums[i] < nums[i - 1]) return nums[i];
        }
        return -1;
    }
}
