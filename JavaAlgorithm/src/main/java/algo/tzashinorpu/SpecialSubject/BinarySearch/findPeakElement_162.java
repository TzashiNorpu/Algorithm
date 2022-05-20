package algo.tzashinorpu.SpecialSubject.BinarySearch;

public class findPeakElement_162 {
    public int findPeakElement(int[] nums) {
        // [1,2,3,3,5,2] -> 5,2 ->
        // [1,5,4,3,2,2]
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < nums[mid + 1]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
