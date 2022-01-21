var maxSubarraySumCircular = function (nums) {
  let max = nums[0];
  let maxTill = nums[0];
  let min = nums[0];
  let minTill = nums[0];
  let sum = nums[0];
  for (let i = 1; i < nums.length; i++) {
    if (maxTill + nums[i] > nums[i]) {
      maxTill = maxTill + nums[i];
    } else {
      maxTill = nums[i];
    }
    if (minTill + nums[i] < nums[i]) {
      minTill = minTill + nums[i];
    } else {
      minTill = nums[i];
    }
    sum += nums[i];
    max = Math.max(max, maxTill);
    min = Math.min(min, minTill);
  }
  // -3,-2,-1->-1
  // 1,2,3->6
  // -1,2,3->5
  // 5,-3,5->10
  if (sum == min) {
    return max;
  }
  return Math.max(sum - min, max);
};
export { maxSubarraySumCircular };
