var removeDuplicates = function (nums) {
  let pos = 0;
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] !== nums[pos]) {
      nums[++pos] = nums[i];
    }
  }
  return nums.slice(0, pos + 1);

  // return pos;
};

export { removeDuplicates };
