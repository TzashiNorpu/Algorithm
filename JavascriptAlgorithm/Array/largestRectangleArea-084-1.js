// 递增队列
var largestRectangleArea1 = function (heights) {
  let max = 0,
    area = 0,
    stack = [-1];
  for (let i = 0; i < heights.length; i++) {
    // 维护递增队列
    // = 的时候不能 pop
    // 假设列表是 [2,2] => 第二个 2 时假如 pop ， 则第一个 2 的面积为 2 是错误的
    while (stack.length > 1 && heights[i] < heights[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = heights[popIndex];
      let leftIndex = stack[stack.length - 1];
      area = popH * (i - leftIndex - 1);
      max = Math.max(max, area);
    }
    stack.push(i);
  }
  let r = heights.length;
  while (stack.length > 1) {
    let popIndex = stack.pop();
    let popH = heights[popIndex];
    let leftIndex = stack[stack.length - 1];
    area = popH * (r - leftIndex - 1);
    max = Math.max(max, area);
  }
  return max;
};
// sentinel
var largestRectangleArea2 = function (heights) {
  let sentry = [].concat(heights).concat([0]);
  let stack = [-1];
  let max = 0,
    area = 0;
  for (let i = 0; i < sentry.length; i++) {
    while (stack.length > 1 && sentry[i] < sentry[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = sentry[popIndex];
      let leftIndex = stack[stack.length - 1];
      area = popH * (i - leftIndex - 1);
      max = Math.max(max, area);
    }
    stack.push(i);
  }
  return max;
};

var largestRectangleArea3 = function (heights) {
  let sentry = [0].concat(heights).concat([0]);
  let pos = 1;
  let stack = [0];
  let max = 0,
    area = 0;
  for (let i = 1; i < sentry.length; i++) {
    while (sentry[i] < sentry[stack[pos - 1]]) {
      let popIndex = stack[--pos];
      let popH = sentry[popIndex];
      let leftIndex = stack[pos - 1];
      area = popH * (i - leftIndex - 1);
      max = Math.max(max, area);
    }
    stack[pos++] = i;
  }
  return max;
};

export { largestRectangleArea1, largestRectangleArea2, largestRectangleArea3 };
