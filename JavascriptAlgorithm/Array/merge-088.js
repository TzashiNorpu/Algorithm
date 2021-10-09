var merge = function (nums1, m, nums2, n) {
  let ints = [].concat(nums1.slice(0, m));
  /* let i = 0,
    j = 0;
  for (; i < m && j < n; ) {
    let item = ints[i] < nums2[j] ? ints[i++] : nums2[j++];
    nums1[i + j - 1] = item;
  }
  if (i === m) {
    for (let index = j; index < n; index++) {
      nums1[i + index] = nums2[index];
    }
  }
  if (j === n) {
    for (let index = m; index < n; index++) {
      nums1[i + index] = ints[index];
    }
  }
  return nums1; */

  for (let i = 0, j = 0; i + j < m + n; ) {
    if (i === m) {
      nums1[i + j] = nums2[j++];
    } else if (j === n) {
      nums1[i + j] = ints[i++];
    } else {
      nums1[i + j] = ints[i] < nums2[j] ? ints[i++] : nums2[j++];
    }
  }
  return nums1;
};

export { merge };
