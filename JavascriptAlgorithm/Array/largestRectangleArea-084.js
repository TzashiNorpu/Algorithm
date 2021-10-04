var largestRectangleArea1 = function (heights) {
  const length = heights.length;
  let max = 0;
  for (let i = 0; i < length; i++) {
    const h = heights[i];
    let left = i,
      right = i;
    while (left > 0 && heights[left - 1] >= h) {
      left--;
    }
    while (right < length - 1 && heights[right + 1] >= h) {
      right++;
    }
    max = Math.max(max, (right - left + 1) * h);
  }
  return max;
};

var largestRectangleArea2 = function (heights) {
  const length = heights.length;
  let max = 0;
  let stack = [-1];
  for (let i = 0; i < length; i++) {
    if (heights[i] >= heights[stack[stack.length - 1]]) {
      stack.push(i);
    } else {
      while (
        stack.length > 1 &&
        heights[i] < heights[stack[stack.length - 1]]
      ) {
        let popIndex = stack.pop();
        let h = heights[popIndex];
        let leftIndex = stack[stack.length - 1];
        max = Math.max(max, (i - leftIndex - 1) * h);
      }
      stack.push(i);
    }
  }

  while (stack.length > 1) {
    let popIndex = stack.pop();
    let h = heights[popIndex];
    let leftIndex = stack[stack.length - 1];
    max = Math.max(max, (length - leftIndex - 1) * h);
  }
  return max;
};

var largestRectangleArea3 = function (heights) {
  let sentry = [0].concat(heights).concat([0]);
  const length = sentry.length;
  let stack = [0];
  /* let stack = new Array(length);
  let arr = new Array(2); // 创建一个长度为2，元素均是undefined的数组
  alert(arr[0]); // undefined！因此不能用new Array方式 */
  let pos = 1;
  let max = 0;
  // 第二段单调递增用 i = length - 1 的元素进行出栈
  // stack 中记载当前的单调递增队列的下标，遍历时更新
  for (let i = 1; i < length; i++) {
    while (sentry[i] < sentry[stack[pos - 1]]) {
      let rightIndex = i;
      let leftIndex = stack[pos - 2];
      let h = sentry[stack[--pos]];
      max = Math.max(max, (rightIndex - leftIndex - 1) * h);
    }
    stack[pos++] = i;
  }
  return max;
};

export { largestRectangleArea1, largestRectangleArea2, largestRectangleArea3 };
