// 双指针
var trap1 = function (height) {
  let l = 0,
    r = height.length - 1;
  let lMax = height[l],
    rMax = height[r];
  let res = 0;
  let area = 0;
  while (l < r) {
    if (height[l] <= height[r]) {
      area = lMax - height[l];
      lMax = Math.max(lMax, height[++l]);
    } else {
      area = rMax - height[r];
      rMax = Math.max(rMax, height[--r]);
    }
    res += area;
  }
  return res;
};
// 动态递归
var trap2 = function (height) {
  let res = 0;
  const length = height.length;
  let lMaxs = [];
  lMaxs[0] = height[0];
  let rMaxs = [];
  rMaxs[length - 1] = height[length - 1];
  for (let i = 1; i < length; i++) {
    lMaxs[i] = Math.max(lMaxs[i - 1], height[i]);
  }
  for (let i = length - 2; i >= 0; i--) {
    rMaxs[i] = Math.max(rMaxs[i + 1], height[i]);
  }
  for (let i = 0; i < length; i++) {
    res += Math.min(lMaxs[i], rMaxs[i]) - height[i];
  }
  return res;
};

// 递减队列
var trap3 = function (height) {
  let stack = [0];
  let res = 0;
  for (let i = 1; i < height.length; i++) {
    while (stack.length > 0 && height[i] > height[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = height[popIndex];
      // stack.length - 1 让 leftIndex = i - 1 使得 area = 0
      let leftIndex = stack.length - 1 < 0 ? i - 1 : stack[stack.length - 1];
      let leftH = height[leftIndex];
      let rightH = height[i];
      let area = (Math.min(leftH, rightH) - popH) * (i - leftIndex - 1);
      res += area;
    }
    stack.push(i);
  }
  return res;
};

export { trap1, trap2, trap3 };
