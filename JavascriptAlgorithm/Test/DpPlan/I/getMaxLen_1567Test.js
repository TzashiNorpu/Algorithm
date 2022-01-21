import { getMaxLen } from "../../../DpPlan/I/getMaxLen_1567.js";
import assert from "assert";
describe("getMaxLen", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s getMaxLen result is ${expected}`, function () {
      assert.equal(JSON.stringify(getMaxLen(num)), JSON.stringify(expected));
    });
  }
  let nums = [
    [1, -2, -3, 4],
    [0, 1, -2, -3, -4],
  ];
  let res = [4, 3];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
