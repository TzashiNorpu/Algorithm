import { permuteUnique } from "../../BackTrack/permuteUnique-047.js";
import assert from "assert";
describe("permute", function () {
  function makeTest(num, expected) {
    it(`[${num}]'s permuteUnique result is ${expected}`, function () {
      assert.equal(
        JSON.stringify(permuteUnique(num)),
        JSON.stringify(expected)
      );
    });
  }
  let nums = [
    [1, 2, 3],
    [1, 1, 2],
  ];
  let res = [
    [
      [1, 2, 3],
      [1, 3, 2],
      [2, 1, 3],
      [2, 3, 1],
      [3, 1, 2],
      [3, 2, 1],
    ],
    [
      [1, 1, 2],
      [1, 2, 1],
      [2, 1, 1],
    ],
  ];
  for (let x = 0; x < nums.length; x++) {
    makeTest(nums[x], res[x]);
  }
});
