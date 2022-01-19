import { canJump } from "../../../DpPlan/I/canJump_55.js";
import assert from "assert";
describe("canJump", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s canJump result is ${expected}`, function () {
      assert.equal(JSON.stringify(canJump(num)), JSON.stringify(expected));
    });
  }
  let nums = [[2, 3, 1, 1, 4], [0, 3, 1, 1, 4], [3, 2, 1, 0, 4], [0]];
  let res = [true, false, false, true];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
