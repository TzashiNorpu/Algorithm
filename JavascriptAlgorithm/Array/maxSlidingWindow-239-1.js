var maxSlidingWindow = function (nums, k) {
  let res = [],
    stack = [];
  for (let i = 0; i < nums.length; i++) {
    while (
      /* stack.length > 0 && */ nums[i] >= nums[stack[stack.length - 1 || 0]]
    ) {
      stack.pop();
    }
    stack.push(i);
    if (i + 1 >= k) {
      res.push(nums[stack[0]]);
    }
    if (i - stack[0] + 1 >= k) {
      stack.shift();
    }
  }
  return res;
};

export { maxSlidingWindow };
