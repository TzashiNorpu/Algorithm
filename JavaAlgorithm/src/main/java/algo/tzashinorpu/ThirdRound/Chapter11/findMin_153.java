package algo.tzashinorpu.ThirdRound.Chapter11;

public class findMin_153 {
    public int findMin(int[] nums) {
        // 3,4,5,6,7,2
        // 4,0,1,2,3
        // 3,4,5,1,2
        int l = 0;
        int r = nums.length - 1;
        int mid;
        if (nums[l] < nums[r]) return nums[l];
        while (l + 1 < r) {
            mid = (l + r) / 2;
            // 左边有序则在右边找
            if (nums[l] < nums[mid]) {
                l = mid;
            } else {
                r = mid;
            }
        }
        return nums[r];
    }
}
