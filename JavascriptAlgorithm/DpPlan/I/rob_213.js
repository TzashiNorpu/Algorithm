var rob = function (nums) {
  if (nums.length == 1) {
    return nums[0];
  }
  let nums1 = nums.slice(0, -1);
  let nums2 = nums.slice(1);
  function getMax(nums) {
    if (nums.length == 1) {
      return nums[0];
    } else {
      nums[1] = Math.max(nums[0], nums[1]);
    }
    for (let i = 2; i < nums.length; i++) {
      nums[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i]);
    }
    return nums[nums.length - 1];
  }
  return Math.max(getMax(nums1), getMax(nums2));
};

export { rob };
