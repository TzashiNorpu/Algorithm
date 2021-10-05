import {
  maxSlidingWindow1,
  maxSlidingWindow2,
} from "../../Array/maxSlidingWindow-239.js";

import { maxSlidingWindow } from "../../Array/maxSlidingWindow-239-1.js";
import assert from "assert";
describe("maxSlidingWindow-1", function () {
  function makeTest(nums, k, expected) {
    it(`[${nums}]'s ${k} maxSlidingWindow is ${expected}`, function () {
      assert.equal(
        JSON.stringify(maxSlidingWindow1(nums, k)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [1, 3, -1, -3, 5, 3, 6, 7],
    [1, -1],
    [7, 2, 4],
    [5, 3, 4],
    [1, 3, 1, 2, 0, 5],
  ];
  let ks = [3, 1, 2, 1, 3];
  let res = [
    [3, 3, 5, 5, 6, 7],
    [1, -1],
    [7, 4],
    [5, 3, 4],
    [3, 3, 2, 5],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], ks[x], res[x]);
  }
});

describe("maxSlidingWindow-2", function () {
  function makeTest(nums, k, expected) {
    it(`[${nums}]'s ${k} maxSlidingWindow is ${expected}`, function () {
      assert.equal(
        JSON.stringify(maxSlidingWindow2(nums, k)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [1, 3, -1, -3, 5, 3, 6, 7],
    [1, -1],
    [7, 2, 4],
    [5, 3, 4],
    [1, 3, 1, 2, 0, 5],
  ];
  let ks = [3, 1, 2, 1, 3];
  let res = [
    [3, 3, 5, 5, 6, 7],
    [1, -1],
    [7, 4],
    [5, 3, 4],
    [3, 3, 2, 5],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], ks[x], res[x]);
  }
});

describe("maxSlidingWindow", function () {
  function makeTest(nums, k, expected) {
    it(`[${nums}]'s ${k} maxSlidingWindow is ${expected}`, function () {
      assert.equal(
        JSON.stringify(maxSlidingWindow(nums, k)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [1, 3, -1, -3, 5, 3, 6, 7],
    [1, -1],
    [7, 2, 4],
    [5, 3, 4],
    [1, 3, 1, 2, 0, 5],
  ];
  let ks = [3, 1, 2, 1, 3];
  let res = [
    [3, 3, 5, 5, 6, 7],
    [1, -1],
    [7, 4],
    [5, 3, 4],
    [3, 3, 2, 5],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], ks[x], res[x]);
  }
});
