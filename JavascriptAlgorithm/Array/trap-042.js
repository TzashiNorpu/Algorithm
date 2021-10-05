var trap1 = function (height) {
  const length = height.length;
  let sum = 0;
  for (let i = 1; i < length - 1; i++) {
    let l = i,
      r = i;
    let lMax = 0,
      rMax = 0;
    while (l--) {
      lMax = Math.max(height[l], lMax);
    }
    while (r < length - 1) {
      rMax = Math.max(height[++r], rMax);
    }
    let area =
      Math.min(lMax, rMax) - height[i] < 0
        ? 0
        : Math.min(lMax, rMax) - height[i];
    sum += area;
  }
  return sum;
};
// 双指针
var trap2 = function (height) {
  let sum = 0;
  let area = 0;
  let l = 0,
    r = height.length - 1;
  let leftMax = height[l],
    rightMax = height[r];
  while (l < r) {
    if (leftMax <= rightMax) {
      area = leftMax - height[l];
      leftMax = Math.max(leftMax, height[++l]);
    } else {
      area = rightMax - height[r];
      rightMax = Math.max(rightMax, height[--r]);
    }
    sum += area;
  }
  return sum;
};

// 动态递归
var trap3 = function (height) {
  const length = height.length;
  let sum = 0;
  let lMax = new Array(length),
    rMax = new Array(length);
  for (let i = 0; i < length; i++) {
    lMax[i] = Math.max(lMax[i - 1] || height[0], height[i]);
  }
  for (let i = length - 1; i >= 0; i--) {
    rMax[i] = Math.max(rMax[i + 1] || height[length - 1], height[i]);
  }
  for (let i = 0; i < length; i++) {
    sum += Math.min(lMax[i], rMax[i]) - height[i];
  }
  return sum;
};
// 递减队列
var trap4 = function (height) {
  let res = 0;
  let stack = [];
  for (let i = 0; i < height.length; i++) {
    while (stack.length > 0 && height[i] > height[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let leftIndex = stack[stack.length - 1] || 0;
      let rightIndex = i;
      let h =
        Math.min(height[leftIndex], height[rightIndex]) - height[popIndex];
      let area = h * (rightIndex - leftIndex - 1);
      res += area < 0 ? 0 : area;
    }
    stack.push(i);
  }
  return res;
};
export { trap1, trap2, trap3, trap4 };
