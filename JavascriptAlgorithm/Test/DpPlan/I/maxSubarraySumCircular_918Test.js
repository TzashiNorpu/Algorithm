import { maxSubarraySumCircular } from "../../../DpPlan/I/maxSubarraySumCircular_918.js";
import assert from "assert";
describe("maxSubarraySumCircular", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s maxSubarraySumCircular result is ${expected}`, function () {
      assert.equal(
        JSON.stringify(maxSubarraySumCircular(num)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [-3, -2, -1],
    [1, 2, 3],
    [-1, 2, 3],
    [5, -3, 5],
  ];
  let res = [-1, 6, 5, 10];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
