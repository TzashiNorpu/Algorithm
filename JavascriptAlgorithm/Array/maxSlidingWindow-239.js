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
  for (let i = 0; i < nums.length; i++) {
    // = 影响性能：弹出尽可能多的元素，后续的shift就会提高性能
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
