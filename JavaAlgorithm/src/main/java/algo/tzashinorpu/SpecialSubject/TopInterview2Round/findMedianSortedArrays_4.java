package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class findMedianSortedArrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int left = (m + n + 1) / 2;
        int l = 0, r = m;
        int mid = 0;
        while (l <= r) {
            // mid 是分隔线 不包含该位置元素
            mid = l + (r - l) / 2;
            // mid == m :数组1所有的元素都在中点左侧
            if (mid == m) {
                break;
            }
            // left - mid 是 nums2 在分隔线左侧的数组个数，索引值需要 -1
            // mid在数组1位置靠左侧了  进行右移
            if (nums2[left - mid - 1] > nums1[mid]) {
                l = mid + 1;
            } else if (mid > 0 && nums1[mid - 1] > nums2[left - mid]) {
                // mid在数组1位置靠右侧了  进行左移
                r = mid - 1;
            } else {
                break;
            }
        }
        
        if ((m + n) % 2 == 0) {
            // 第一组0个
            if (mid == 0) {
                if (m == 0) return (nums2[(n - 1) / 2] + nums2[n / 2]) / 2.0;
                // 第二组全选
                if (left - mid == n) {
                    return (nums2[left - mid - 1] + nums1[mid]) / 2.0;
                }
                return (nums2[left - mid - 1] + Math.min(nums1[mid], nums2[left - mid])) / 2.0;
            }
            // 第二组0个
            if (left - mid == 0) {
                // 第一组全选
                if (mid == m) {
                    return (nums1[mid - 1] + nums2[left - mid]) / 2.0;
                }
                return (nums1[mid - 1] + Math.min(nums1[mid], nums2[left - mid])) / 2.0;
            }
            // 第一组全选
            if (mid == m) {
                return (Math.max(nums1[mid - 1], nums2[left - mid - 1]) + nums2[left - mid]) / 2.0;
            }
            // 第二组全选
            if (left - mid == n) {
                return (Math.max(nums1[mid - 1], nums2[left - mid - 1]) + nums1[mid]) / 2.0;
            }
            return (Math.max(nums1[mid - 1], nums2[left - mid - 1]) + Math.min(nums1[mid], nums2[left - mid])) / 2.0;
        } else {
            // 第一组0个
            if (mid == 0) {
                return nums2[left - mid - 1] * 1.0;
            }
            // 第二组0个
            if (left - mid == 0) {
                return nums1[mid - 1] * 1.0;
            }
            return Math.max(nums1[mid - 1], nums2[left - mid - 1]) * 1.0;
        }
    }
}
