import {
  largestRectangleArea1,
  largestRectangleArea2,
} from "../../Array/largestRectangleArea-084-2.js";
import assert from "assert";
describe("largestRectangleArea-1", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s largestRectangleArea is ${expected}`, function () {
      assert.equal(largestRectangleArea1(height), expected);
    });
  }
  let heights = [/* [2, 1, 5, 6, 2, 3],  */[2, 4], [1], [5, 4, 1, 2], [2, 1, 2]];
  let res = [/* 10,  */4, 1, 8, 3];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});

describe("largestRectangleArea-2", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s largestRectangleArea is ${expected}`, function () {
      assert.equal(largestRectangleArea2(height), expected);
    });
  }
  let heights = [[2, 1, 5, 6, 2, 3], [2, 4], [1], [5, 4, 1, 2], [2, 1, 2]];
  let res = [10, 4, 1, 8, 3];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});
/* 
describe("largestRectangleArea-3", function () {
  function makeTest(height, expected) {
    it(`[${height}]'s largestRectangleArea is ${expected}`, function () {
      assert.equal(largestRectangleArea3(height), expected);
    });
  }
  let heights = [[2, 1, 5, 6, 2, 3], [2, 4], [1], [5, 4, 1, 2], [2, 1, 2]];
  let res = [10, 4, 1, 8, 3];
  for (let x = 0; x < heights.length; x++) {
    makeTest(heights[x], res[x]);
  }
});
 */
