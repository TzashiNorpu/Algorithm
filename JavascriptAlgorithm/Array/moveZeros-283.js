var moveZeroes = function (nums) {
  for (let i = 0, j = 0; i < nums.length; i++) {
    if (nums[i] !== 0) {
      nums[j++] = nums[i];
      // j - 1 恢复 j 的值
      if (i !== j - 1) {
        nums[i] = 0;
      }
    }
  }
  return nums;
};

export { moveZeroes };
