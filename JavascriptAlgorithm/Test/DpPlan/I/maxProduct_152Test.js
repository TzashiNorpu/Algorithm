import { maxProduct } from "../../../DpPlan/I/maxProduct_152.js";
import assert from "assert";
describe("maxProduct", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s maxProduct result is ${expected}`, function () {
      assert.equal(JSON.stringify(maxProduct(num)), JSON.stringify(expected));
    });
  }
  let nums = [
    [2, 3, -2, 4],
    [-2, 0, -1],
  ];
  let res = [6, 0];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
