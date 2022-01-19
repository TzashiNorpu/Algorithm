import { jump } from "../../../DpPlan/I/jump_45.js";
import assert from "assert";
describe("jump", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s jump result is ${expected}`, function () {
      assert.equal(JSON.stringify(jump(num)), JSON.stringify(expected));
    });
  }
  let nums = [[2, 3, 1, 1, 4], [2, 3, 0, 1, 4], [1, 2], [0]];
  let res = [2, 2, 1, 0];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
