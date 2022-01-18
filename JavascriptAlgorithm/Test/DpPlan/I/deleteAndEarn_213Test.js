import { deleteAndEarn } from "../../../DpPlan/I/deleteAndEarn_740.js";
import assert from "assert";
describe("deleteAndEarn", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s deleteAndEarn result is ${expected}`, function () {
      assert.equal(
        JSON.stringify(deleteAndEarn(num)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [3, 4, 2],
    [2, 2, 3, 3, 3, 4],
  ];
  let res = [6, 9];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
