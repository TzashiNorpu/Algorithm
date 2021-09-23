var maxArea = function (height) {
  const length = height.length;
  let maxArea = 0;
  for (let l = 0, r = length - 1; l < r; ) {
    let area =
      height[l] > height[r]
        ? height[r--] * (r - l + 1)
        : height[l++] * (r - l + 1);
    maxArea = Math.max(area, maxArea);
  }
  return maxArea;
};
export {maxArea};
