import { maxSubArray } from "../../../DpPlan/I/maxSubArray_53.js";
import assert from "assert";
describe("maxSubArray", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s maxSubArray result is ${expected}`, function () {
      assert.equal(JSON.stringify(maxSubArray(num)), JSON.stringify(expected));
    });
  }
  let nums = [[-2, 1, -3, 4, -1, 2, 1, -5, 4], [1], [5, 4, -1, 7, 8], [-1]];
  let res = [6, 1, 23, -1];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
