import { twoSum, twoSum1 } from "../../Array/twoSum-001.js";
import assert from "assert";
describe("twoSum", function () {
  function makeTest(num, target, expected) {
    it(`[${num}] index [${expected}] sum is ${target}`, function () {
      assert.equal(twoSum(num, target).toString, expected.toString);
    });
  }
  let nums = [
    [2, 0, 7],
    [3, 1, 9],
    [2, 8, 8],
    [15, 0, 1],
  ];
  let targets = [9, 12, 16, 15];
  let res = [
    [0, 2],
    [0, 2],
    [1, 2],
    [0, 1],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], targets[x], res[x]);
  }
});

describe("twoSum1", function () {
  function makeTest(num, target, expected) {
    it(`[${num}] index [${expected}] sum is ${target}`, function () {
      assert.equal(twoSum1(num, target).toString, expected.toString);
    });
  }
  let nums = [
    [2, 0, 7],
    [3, 1, 9],
    [2, 8, 8],
    [15, 0, 1],
  ];
  let targets = [9, 12, 16, 15];
  let res = [
    [0, 2],
    [0, 2],
    [1, 2],
    [0, 1],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], targets[x], res[x]);
  }
});
