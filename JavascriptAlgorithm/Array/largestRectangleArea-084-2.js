// 递增队列
var largestRectangleArea1 = function (heights) {
  let stack = [];
  let area = 0;
  stack[0] = 0;
  let max = 0;
  // 递增队列：sentinel 元素的值选择负数，确保这个元素不会出栈[数组的元素值都 >= 0]
  let sentry = [-1].concat(heights);
  for (let i = 1; i < sentry.length; i++) {
    // < 和 <= 都可以
    // < : 假设站内有一个 5 ，遍历的下一个元素为 5 ，< 时先入栈，栈内此时有两个 5 ，再下一个遍历元素为 4 ：则弹出末尾的 5 ，计算其面积为 5（假设这三个元素连续），在弹出第二个 5 时
    // 面积为 10，若为 <= : 遍历第二个 5 时 弹出第一个 5 计算其面积为 5 ，并将第二个 5 入栈，遍历到元素值 4 时 ，弹出第二个 5 的元素，此时宽度为 2 ，面积为 10
    // <= 可以更快的减少 stack 中的元素
    while (sentry[i] <= sentry[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = sentry[popIndex];
      let leftIndex = stack[stack.length - 1];
      area = popH * (i - leftIndex - 1);
      max = Math.max(area, max);
    }
    stack.push(i);
  }
  // 加上 sentinel 元素后的长度
  let r = heights.length + 1;
  while (stack.length > 1) {
    let popIndex = stack.pop();
    let popH = sentry[popIndex];
    let leftIndex = stack[stack.length - 1];
    area = popH * (r - leftIndex - 1);
    max = Math.max(area, max);
  }
  return max;
};
// sentinel
var largestRectangleArea2 = function (heights) {
  let stack = [];
  let area = 0;
  stack[0] = 0;
  let max = 0;
  // 压入的元素都小于0，且队首压入的元素比队尾压入的元素值小，最后单调栈中只剩下这两个元素
  let sentry = [-2].concat(heights).concat([-1]);
  for (let i = 1; i <= sentry.length; i++) {
    while (sentry[i] < sentry[stack[stack.length - 1]]) {
      let popIndex = stack.pop();
      let popH = sentry[popIndex];
      let leftIndex = stack[stack.length - 1];
      area = popH * (i - leftIndex - 1);
      max = Math.max(area, max);
    }
    stack.push(i);
  }
  return max;
};
// 递增索引
var largestRectangleArea3 = function (heights) {
  let stack = [];
  let area = 0;
  stack[0] = 0;
  let pos = 1;
  let max = 0;
  let sentry = [-2].concat(heights).concat([-1]);
  for (let i = 1; i <= sentry.length; i++) {
    while (sentry[i] < sentry[stack[pos - 1]]) {
      let popIndex = stack[--pos];
      let popH = sentry[popIndex];
      let leftIndex = stack[pos - 1];
      area = popH * (i - leftIndex - 1);
      max = Math.max(area, max);
    }
    stack[pos++] = i;
  }
  return max;
};
export { largestRectangleArea1, largestRectangleArea2, largestRectangleArea3 };
