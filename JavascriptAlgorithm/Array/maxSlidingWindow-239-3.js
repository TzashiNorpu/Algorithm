var maxSlidingWindow1 = function (nums, k) {
  let res = [];
  for (let i = k - 1; i < nums.length; i++) {
    let max = nums[i - k + 1];
    for (let j = i - k + 2; j <= i; j++) {
      max = Math.max(max, nums[j]);
    }
    res.push(max);
  }
  return res;
};

var maxSlidingWindow2 = function (nums, k) {
  let res = [],
    stack = [];
  for (let i = 0; i < nums.length; i++) {
    while (stack.length > 0 && nums[i] >= nums[stack[stack.length - 1]]) {
      stack.pop();
    }
    stack.push(i);
    if (i - stack[0] >= k) {
      stack.shift();
    }
    if (i >= k - 1) {
      res.push(nums[stack[0]]);
    }
  }
  return res;
};

export { maxSlidingWindow1, maxSlidingWindow2 };
