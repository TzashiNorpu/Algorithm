package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class findMedianSortedArrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int left = (m + n + 1) / 2;
        int l = 0, r = m;
        int mid = 0;
        while (l <= r) {
            // mid 是分隔线
            mid = l + (r - l) / 2;
            // left - mid 是 nums2 在分隔线左侧的数组个数，索引值需要 -1
            if (nums2[left - mid - 1] > nums1[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if ((m + n) % 2 == 0) {
            if (mid == 0) {
                return (nums2[left - 1] + Math.min(nums2[left], nums1[0])) / 2.0;
            } else {
                return (Math.max(nums1[mid - 1], nums2[left - mid - 1]) + Math.max(nums1[mid], nums2[left - mid])) / 2.0;
            }
        } else {
            if (mid == 0) {
                return nums2[left - 1] * 1.0;
            } else {
                return Math.max(nums1[mid - 1], nums2[left - mid - 1]) * 1.0;
            }
        }
    }
}
