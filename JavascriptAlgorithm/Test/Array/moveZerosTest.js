import { moveZeroes } from "../../Array/moveZeros-283.js";
import assert from "assert";
describe("moveZeroes", function () {
  function makeTest(num, expected) {
    it(`[${num}] move zeros is [${expected}]`, function () {
      assert.equal(moveZeroes(num).toString(), expected.toString());
    });
  }
  let nums = [
    [0, 1, 0, 3, 12],
    [1, 0],
    [2,1],
    [1,0,1]
  ];
  let res = [
    [1, 3, 12, 0, 0],
    [1, 0],
    [2,1],
    [1,1,0]
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
