var maxSlidingWindow1 = function (nums, k) {
  let res = [];
  for (let i = 0; i <= nums.length - k; i++) {
    let max = nums[i];
    for (let j = i; j < i + k; j++) {
      max = Math.max(max, nums[j]);
    }
    res.push(max);
  }
  return res;
};

var maxSlidingWindow2 = function (nums, k) {
  let res = [],
    stack = [];
  // 维护单调递减队列
  let maxIndex = 0;
  for (let i = 0; i < nums.length; i++) {
    while (stack.length > 0 && nums[i] > nums[stack[stack.length - 1]]) {
      stack.pop();
    }
    stack.push(i);
    if (i >= k - 1) {
      //   res.push(nums[stack[0]]);
      res.push(nums[stack[maxIndex]]);
    }
    // if (i - stack[0] >= k) {
    if (i - stack[maxIndex] + 1 >= k) {
      //   stack.shift();
      maxIndex++;
      // shift 影响性能 用 maxIndex 变量代替
    }
  }
  return res;
};

export { maxSlidingWindow1, maxSlidingWindow2 };
