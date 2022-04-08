package algo.tzashinorpu.FourthRound.Chapter03;

public class merge_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = nums1.length;
        int[] nums = new int[length];
        System.arraycopy(nums1, 0, nums, 0, length);
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < length; i++) {
            if (i1 < m && i2 < n)
                nums1[i] = nums[i1] < nums2[i2] ? nums[i1++] : nums2[i2++];
            else {
                if (i1 == m)
                    nums1[i] = nums2[i2++];
                else
                    nums1[i] = nums[i1++];
            }
        }
    }
}
