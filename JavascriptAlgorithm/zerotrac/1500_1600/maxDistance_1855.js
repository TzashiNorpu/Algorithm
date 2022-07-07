var maxDistance = function (nums1, nums2) {
    /*
    55, 30, 5, 4,2
    100,20,10,10,5
    */
    let l = nums1.length - 1, r = nums2.length - 1;
    let len = 0;
    while (l >= 0 && r >= 0) {
        // nums1 的最小值大于 nums2 的最大值
        if (nums1[l] > nums2[0]) break;

        while (l >= 0 && r >= 0 && nums2[r] < nums1[l]) {
            r--;
            l--;
        }
        while (l >= 0 && nums1[l] <= nums2[r]) l--;
        if (l == -1 && nums2[r] < nums1[0]) return len;
        len = Math.max(len, r - l - 1)
    }
    return len;
};
export {maxDistance}