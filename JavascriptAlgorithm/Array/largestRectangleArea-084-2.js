// 递增队列
var largestRectangleArea1 = function (heights) {
  let stack = [];
  let area = 0;
  stack[0] = 0;
  let max = 0;
  let sentry = [-1].concat(heights);
  for (let i = 1; i < sentry.length; i++) {
    while (sentry[i] <= sentry[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = sentry[popIndex];
      let leftIndex = stack[stack.length - 1];
      area = popH * (i - leftIndex - 1);
      max = Math.max(area, max);
    }
    stack.push(i);
  }
  let r = stack.length;
  while (stack.length > 1) {
    let popIndex = stack.pop();
    let popH = sentry[popIndex];
    let leftIndex = stack[stack.length - 1];
    area = popH * (r - leftIndex);
    max = Math.max(area, max);
  }
  return max;
};
// sentinel
var largestRectangleArea2 = function (heights) {};

var largestRectangleArea3 = function (heights) {};

export { largestRectangleArea1, largestRectangleArea2, largestRectangleArea3 };
