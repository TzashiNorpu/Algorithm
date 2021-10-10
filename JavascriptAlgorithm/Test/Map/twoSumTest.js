import { twoSum } from "../../Map/twoSum-001.js";
import assert from "assert";
describe("twoSum", function () {
  function makeTest(num, target, expected) {
    it(`[${num}]'s index ${expected} sum target ins ${target}`, function () {
      assert.equal(
        JSON.stringify(twoSum(num, target)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [2, 7, 11, 15],
    [3, 2, 4],
    [3, 3],
  ];
  let targets = [9, 6, 6];
  let res = [
    [0, 1],
    [1, 2],
    [0, 1],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], targets[x], res[x]);
  }
});
