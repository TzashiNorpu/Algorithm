var maxSubArray = function (nums) {
  // -2,1,-3,4,-1,2,1,-5,4 -> 6
  let max = nums[0];
  let maxTill = nums[0];
  for (let i = 1; i < nums.length; i++) {
    if (maxTill + nums[i] > nums[i]) {
      maxTill = maxTill + nums[i];
    } else {
      maxTill = nums[i];
    }
    max = Math.max(max, maxTill);
  }
  return max;
};
export { maxSubArray };
