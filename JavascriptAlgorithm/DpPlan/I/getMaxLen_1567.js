var getMaxLen = function (nums) {
  let posDp = [];
  let negDp = [];
  posDp[0] = nums[0] > 0 ? 1 : 0;
  negDp[0] = nums[0] < 0 ? 1 : 0;
  let step = posDp[0];
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] > 0) {
      posDp[i] = posDp[i - 1] + 1;
      if (negDp[i - 1] == 0) {
        negDp[i] = 0;
      } else {
        negDp[i] = negDp[i - 1] + 1;
      }
    } else if (nums[i] < 0) {
      negDp[i] = posDp[i - 1] + 1;
      if (negDp[i - 1] == 0) {
        posDp[i] = 0;
      } else {
        posDp[i] = negDp[i - 1] + 1;
      }
    } else {
      posDp[i] = 0;
      negDp[i] = 0;
    }
    step = Math.max(step, posDp[i]);
  }
  return step;
};
export { getMaxLen };
