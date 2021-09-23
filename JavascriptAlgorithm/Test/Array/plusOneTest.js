import { plusOne } from "../../Array/plusOne-066.js";
import assert from "assert";
describe("plusOne", function () {
  function makeTest(height, expected) {
    it(`[${height}] plusOne is [${expected}]`, function () {
      assert.equal(plusOne(height).toString, expected.toString);
    });
  }
  let nums = [
    [2, 9, 9],
    [2, 8, 9],
    [2, 8, 8],
    [9, 9],
  ];
  let res = [
    [3, 0, 0],
    [2, 9, 0],
    [2, 8, 9],
    [1, 0, 0],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
