import { maxArea } from "../../Array/maxArea-011.js";
import assert from "assert";
describe("maxArea", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s maxArea is ${expected}`, function () {
      assert.equal(maxArea(height), expected);
    });
  }
  let heights = [
    [1, 8, 6, 2, 5, 4, 8, 3, 7],
    [4, 3, 2, 1, 4],
  ];
  let res = [49, 16];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});
