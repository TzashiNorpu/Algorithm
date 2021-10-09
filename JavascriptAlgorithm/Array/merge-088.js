var merge = function (nums1, m, nums2, n) {
  let ints = [].concat(nums1.slice(0, m));
  for (let i = 0, j = 0; i < m && j < n; ) {
    let item = ints[i] < nums2[j] ? ints[i++] : nums2[j++];
  }
  return nums1;
};

export { merge };
