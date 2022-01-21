var maxProduct = function (nums) {
  // 2,3,-2,4->6
  let max = nums[0];
  let posDp = [];
  posDp[0] = nums[0] > 0 ? nums[0] : 0;
  let negDp = [];
  negDp[0] = nums[0] < 0 ? nums[0] : 0;
  for (let i = 1; i < nums.length; i++) {
    posDp[i] = Math.max(
      posDp[i - 1] * nums[i],
      negDp[i - 1] * nums[i],
      nums[i]
    );
    negDp[i] = Math.min(
      posDp[i - 1] * nums[i],
      negDp[i - 1] * nums[i],
      nums[i]
    );
    max = Math.max(max, posDp[i]);
  }
  return max;
};
export { maxProduct };
