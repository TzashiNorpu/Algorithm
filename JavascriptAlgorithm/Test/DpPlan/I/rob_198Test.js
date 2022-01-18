import { rob } from "../../../DpPlan/I/rob_198.js";
import assert from "assert";
describe("rob", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s rob result is ${expected}`, function () {
      assert.equal(JSON.stringify(rob(num)), JSON.stringify(expected));
    });
  }
  let nums = [
    [1, 2, 3, 1],
    [2, 7, 9, 3, 1],
  ];
  let res = [4, 12];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
