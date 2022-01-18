import { rob } from "../../../DpPlan/I/rob_213.js";
import assert from "assert";
describe("rob", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s rob result is ${expected}`, function () {
      assert.equal(JSON.stringify(rob(num)), JSON.stringify(expected));
    });
  }
  let nums = [[2, 3, 2], [1, 2, 3, 1], [0]];
  let res = [3, 4, 0];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
