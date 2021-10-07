// 双指针
var trap1 = function (height) {
  let res = 0;
  let area = 0;
  let l = 0,
    r = height.length - 1;
  let lMax = height[l],
    rMax = height[r];

  while (l < r) {
    if (lMax <= rMax) {
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
  let length = height.length;
  let lMaxs = [];
  lMaxs[0] = [height[0]];
  let rMaxs = [];
  rMaxs[height.length - 1] = [height[height.length - 1]];
  for (let i = 1; i < length; i++) {
    lMaxs[i] = Math.max(lMaxs[i - 1], height[i]);
  }
  for (let i = height.length - 2; i >= 0; i--) {
    rMaxs[i] = Math.max(height[i], rMaxs[i + 1]);
  }
  for (let i = 0; i < length; i++) {
    res += Math.min(lMaxs[i], rMaxs[i]) - height[i];
  }
  return res;
};

// 递减队列
var trap3 = function (height) {
  let res = 0;
  let stack = [0];
  // Infinity 确保哨兵永远不会出栈
  let sentry = [Infinity].concat(height);
  for (let i = 1; i < sentry.length; i++) {
    while (sentry[i] >= sentry[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = sentry[popIndex];
      let leftIndex = stack[stack.length - 1];
      let leftH = sentry[leftIndex];
      let area =
        leftIndex === 0
          ? 0
          : (i - leftIndex - 1) * (Math.min(leftH, sentry[i]) - popH);
      res += area;
    }
    stack.push(i);
  }
  return res;
};

// 递减索引
var trap4 = function (height) {
  let res = 0;
  let stack = [0];
  // Infinity 确保哨兵永远不会出栈
  let pos = 1;
  let sentry = [Infinity].concat(height);
  for (let i = 1; i < sentry.length; i++) {
    while (sentry[i] >= sentry[stack[pos - 1]]) {
      let popIndex = stack[--pos];
      let popH = sentry[popIndex];
      let leftIndex = stack[pos - 1];
      let leftH = sentry[leftIndex];
      // 左边界是哨兵元素，取面积为 0
      let area =
        leftIndex === 0
          ? 0
          : (i - leftIndex - 1) * (Math.min(leftH, sentry[i]) - popH);
      res += area;
    }
    stack[pos++] = i;
  }
  return res;
};

// 递减队列
var trap5 = function (height) {
  let res = 0;
  let stack = [0];
  // stack.length > 1 时哨兵元素的值可以为任何值
  let sentry = [3].concat(height);
  for (let i = 1; i < sentry.length; i++) {
    while (stack.length > 1 && sentry[i] >= sentry[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = sentry[popIndex];
      let leftIndex = stack[stack.length - 1];
      let leftH = sentry[leftIndex];
      let area =
        leftIndex === 0
          ? 0
          : (i - leftIndex - 1) * (Math.min(leftH, sentry[i]) - popH);
      res += area;
    }
    stack.push(i);
  }
  return res;
};

export { trap1, trap2, trap3, trap4, trap5 };
